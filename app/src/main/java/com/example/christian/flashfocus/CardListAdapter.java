package com.example.christian.flashfocus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Christian on 7/20/2015.
 */
public class CardListAdapter extends ArrayAdapter {

    public CardListAdapter(Context context, ArrayList<Card> cards) {
        super(context,0, cards);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Card cardList = (Card) getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.master_list_item_row, parent, false);
        }

        TextView setName = (TextView)convertView.findViewById(R.id.master_list_item);
        setName.setText(cardList.getQuestion());

        return convertView;
    }
}
