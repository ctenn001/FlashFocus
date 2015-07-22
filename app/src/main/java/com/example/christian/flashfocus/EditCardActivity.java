package com.example.christian.flashfocus;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Christian on 7/17/2015.
 */
public class EditCardActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        EditCardFragment Fragment = new EditCardFragment();
        FragmentManager fm = getFragmentManager();

        fm.beginTransaction().add(R.id.fragmentContainer, Fragment).commit();

    }
}
