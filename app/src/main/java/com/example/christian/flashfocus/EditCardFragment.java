package com.example.christian.flashfocus;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Christian on 7/17/2015.
 */
public class EditCardFragment extends Fragment {

    private Button addCardButton;
    private Button returnHomeButton;
    private Button deleteCardButton;
    private EditText cardQuestion;
    private EditText cardAnswer;
    private CardSet currentCardSet;
    private int cardsetpos;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        cardsetpos = 0;
        Intent i = getActivity().getIntent();

        currentCardSet = i.getParcelableExtra("CardSet");
        for(int x = 0; x < MasterCardSetList.getMasterList().size(); x++)
        {
            if(currentCardSet.getName().equals(MasterCardSetList.getMasterList().get(x).getName()))
            {
                cardsetpos = x;
            }

        }

        getActivity().setTitle(MasterCardSetList.getMasterList().get(cardsetpos).getName() + " Card Set");
        getActivity().getActionBar().setHomeButtonEnabled(true);
        getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.edit_card_fragment, container, false);

        addCardButton = (Button)v.findViewById(R.id.addcardbutton);
        deleteCardButton = (Button)v.findViewById(R.id.deletecardbutton);
        returnHomeButton = (Button)v.findViewById(R.id.returnhomebutton);
        cardQuestion = (EditText)v.findViewById(R.id.question);
        cardAnswer = (EditText)v.findViewById(R.id.answer);

        addCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Card card = new Card(cardQuestion.getText().toString(), cardAnswer.getText().toString());
                MasterCardSetList.getMasterList().get(cardsetpos).add(card);
                Intent nextCard = new Intent(getActivity(), EditCardActivity.class);
                nextCard.putExtra("CardSet", (Parcelable) currentCardSet);
                startActivity(nextCard);

            }
        });

        deleteCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        returnHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), FlashFocusActivity.class);
                startActivity(i);
            }
        });
        return v;
    }

}
