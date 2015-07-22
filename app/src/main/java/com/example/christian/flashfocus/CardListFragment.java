package com.example.christian.flashfocus;

import android.app.ListFragment;
import android.os.Bundle;

/**
 * Created by Christian on 7/20/2015.
 */
public class CardListFragment extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        CardListAdapter adapter = new CardListAdapter(getActivity(),) //Need to pass in reference of card set from CardSetList Activity
    }


}
