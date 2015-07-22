package com.example.christian.flashfocus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Christian on 7/19/2015.
 */
public class MasterListAdapter extends ArrayAdapter<CardSet> {

    public MasterListAdapter(Context context, ArrayList<CardSet> list)
    {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        CardSet masterList = getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.master_list_item_row, parent, false);
        }

        TextView setName = (TextView)convertView.findViewById(R.id.master_list_item);
        setName.setText(masterList.getName());

        return convertView;
    }

}
