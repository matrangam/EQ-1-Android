package com.example.michaelmatranga.eq1.models;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class EarthquakeDetails {
    @SerializedName("detail")
    private String mDetail;

    @SerializedName("time")
    private BigInteger mTimeInSeconds;

    @SerializedName("mag")
    private Double mMagnitude;

    @SerializedName("place")
    private String mPlace;

    @SerializedName("title")
    private String mTitle;


    public String getTitle() {
        return mTitle;
    }

    public String getPlace() {
        return mPlace;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public BigInteger getTimeInSeconds() {
        return mTimeInSeconds;
    }

    public String getDetail() {
        return mDetail;
    }
}
