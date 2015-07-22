package com.example.christian.flashfocus;

import java.util.ArrayList;

/**
 * Created by Christian on 7/17/2015.
 */
public class MasterCardSetList extends ArrayList<CardSet> {

    private static MasterCardSetList masterList = null;

    protected MasterCardSetList(){}

    public static MasterCardSetList getMasterList()
    {
        if(masterList == null )
        {
            masterList = new MasterCardSetList();
        }
        
        return masterList;
    }


}
