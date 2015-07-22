package com.example.christian.flashfocus;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Christian on 7/17/2015.
 */
public class NewCardSetActivity extends FragmentActivity {

    @Override

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        NewCardSetFragment fragment = new NewCardSetFragment();
        getFragmentManager().beginTransaction().add(R.id.fragmentContainer, fragment).commit();




    }
}
