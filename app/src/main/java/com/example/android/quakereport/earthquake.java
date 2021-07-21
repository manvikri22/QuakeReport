package com.example.android.quakereport;

public class earthquake {

    private String mMagnitude;

    private String mLocation;

    private String mDate;

    public earthquake(String magnitude, String Location, String date)
    {
        mMagnitude = magnitude;
        mLocation = Location;
        mDate = date;
    }

    public String getMagnitude(){ return mMagnitude;}

    public String getLocation(){ return mLocation;}

    public String getDate(){ return mDate;}
}
