package com.example.christian.flashfocus;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Christian on 7/19/2015.
 */
public class QuizActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Fragment fragment = new QuizFragment();
        FragmentManager fm = getFragmentManager();

        fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
    }
}
