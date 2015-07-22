package com.example.christian.flashfocus;


import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Christian on 7/19/2015.
 */
public class SetListFragment extends ListFragment {


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        MasterListAdapter adapter = new MasterListAdapter(getActivity(),MasterCardSetList.getMasterList());

        setListAdapter(adapter);




    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {

    }








}
