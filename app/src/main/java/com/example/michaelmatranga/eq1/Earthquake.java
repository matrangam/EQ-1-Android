package com.example.michaelmatranga.eq1;

import com.google.gson.annotations.SerializedName;

class EarthquakeProperties {

    @SerializedName("properties")
    public Earthquake properties;

    public class Earthquake {
        @SerializedName("detail")
        public String mDetail;
        public Double mLatitude;
        public Double mLongitude;
        @SerializedName("time")
        public Double mTimeInSeconds;
        @SerializedName("mag")
        public Double mMagnitude;
        @SerializedName("place")
        public String mPlace;
    }
}