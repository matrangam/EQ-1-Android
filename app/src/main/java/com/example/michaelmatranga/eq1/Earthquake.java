package com.example.michaelmatranga.eq1;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

class EarthquakeProperties {

    @SerializedName("properties")
    private Earthquake properties;

    public class Earthquake {
        @SerializedName("detail")
        private String mDetail;
        private Double mLatitude;
        private Double mLongitude;
        @SerializedName("time")
        private BigInteger mTimeInSeconds;
        @SerializedName("mag")
        private Double mMagnitude;
        @SerializedName("place")
        private String mPlace;
        @SerializedName("title")
        private String title;
    }
}