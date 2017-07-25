package com.example.michaelmatranga.eq1;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

class EarthquakeProperties {

    @SerializedName("properties")
    private Earthquake properties;

    class Earthquake {
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

    }

    @SerializedName("geometry")
    private Geometry mGeometry;

    class Geometry {
        @SerializedName("mCoordinates")
        private List<Double> mCoordinates;
    }

    public Double getLatitude() {
        return mGeometry.mCoordinates.get(0);
    }

    public Double getLongitude() {
        return mGeometry.mCoordinates.get(1);
    }
}
