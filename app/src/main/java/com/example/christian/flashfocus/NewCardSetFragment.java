package com.example.christian.flashfocus;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class NewCardSetFragment extends Fragment {

    private Button newCardSetButton;
    private EditText CardSetName;
    private String CardSet = "CardSet";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState)
    {


        View v = inflater.inflate(R.layout.new_card_set_fragment, container, false);
        newCardSetButton = (Button)v.findViewById(R.id.CreateCardSet);
        CardSetName = (EditText)v.findViewById(R.id.CardSetName);

        newCardSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CardSet cardSet = new CardSet();
                if(CardSetName.getText().toString().equals(""))
                {
                    Toast error = Toast.makeText(v.getContext(),"Please Enter a Name", Toast.LENGTH_LONG);
                    error.show();
                }
                else {
                    String cardSetName = CardSetName.getText().toString();
                    cardSet.setName(cardSetName);
                    MasterCardSetList.getMasterList().add(cardSet);
                    Intent i = new Intent(getActivity(), EditCardActivity.class);
                    i.putExtra(CardSet, (Parcelable) cardSet);
                    startActivity(i);

                    Toast.makeText(v.getContext(), cardSet.getName() + " Set has been created.", Toast.LENGTH_LONG).show();
                }
            }
        });


        return v;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
