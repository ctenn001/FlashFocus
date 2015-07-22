package com.example.christian.flashfocus;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import static com.example.christian.flashfocus.R.drawable.ic_menu_black_24dp;

/**
 * Created by Christian on 7/17/2015.
 */
public class FlashFocusActivity extends Activity {

    private Button newSetButton;
    private DrawerLayout mDrawerLayout;
    private ListView mListView;
    private String[] mNavigationItemTitles;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flash_focus_activity);
        Toast masterList = new Toast(getApplicationContext());
        masterList.makeText(getApplicationContext(),"List count at: " + MasterCardSetList.getMasterList().size(), Toast.LENGTH_SHORT).show();
        mNavigationItemTitles = getResources().getStringArray(R.array.navigation_drawer_item_array);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,new Toolbar(getApplicationContext()),0,0);

        mListView = (ListView)findViewById((R.id.left_drawer));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,mNavigationItemTitles );
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Log.d("FlashFocusActivity", "Card Sets Button Pressed");
                         i = new Intent(view.getContext(), SetListActivity.class);
                        startActivity(i);
                        break;
                    case 2:
                        Log.d("FlashFocusActivity", "Quiz Button Pressed");
                         i = new Intent(view.getContext(), QuizActivity.class);
                        startActivity(i);
                        break;

                }
            }
        });


        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        newSetButton = (Button)findViewById(R.id.NewCardSetButton);
        newSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NewCardSetActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(mDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
