package com.example.christian.flashfocus;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Christian on 7/17/2015.
 */
public class CardSet extends ArrayList<Card> implements Parcelable {

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String setName) {
        this.Name = setName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
    }

    public static final Parcelable.Creator<CardSet> CREATOR = new
            Parcelable.Creator<CardSet>(){

                @Override
                public CardSet createFromParcel(Parcel source) {
                    CardSet cardSet = new CardSet();
                    cardSet.setName(source.readString());
                    return  cardSet;
                }

                @Override
                public CardSet[] newArray(int size) {
                    return new CardSet[0];
                }
            };
}
