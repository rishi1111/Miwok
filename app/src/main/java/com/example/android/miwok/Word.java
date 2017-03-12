package com.example.android.miwok;

/**
 * Created by Rishi on 12-Mar-17.
 */

public class Word {

    private String mDefaultTranslation;
    private int mImageResourceId;
    private String mMiwokTranslation;


    public Word(String DefaultTranslation,String MiwokTranslation)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;

    }

    public Word(String DefaultTranslation,String MiwokTranslation,int ImageResourceId){

        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;


    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}
