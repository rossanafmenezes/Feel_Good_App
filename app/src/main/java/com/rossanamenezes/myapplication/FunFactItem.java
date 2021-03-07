package com.rossanamenezes.myapplication;

public class FunFactItem {

    private String mFunFact;
    private int mImageResourceId;

    public FunFactItem (String funFact, int imageResourceId){

        mFunFact = funFact;
        mImageResourceId = imageResourceId;
    }

    public String getFunFact () {

        return mFunFact;
    }

    public int getImageResourceId () {

        return mImageResourceId;
    }

}
