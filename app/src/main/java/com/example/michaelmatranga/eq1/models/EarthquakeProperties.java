package com.example.michaelmatranga.eq1.models;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class EarthquakeProperties {

    @SerializedName("properties")
    private Earthquake mProperties;

    public Earthquake getProperties() {
        return mProperties;
    }

    public class Earthquake {
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
    }

    @SerializedName("geometry")
    private Geometry mGeometry;

    class Geometry {
        @SerializedName("coordinates")
        private List<Double> mCoordinates;
    }

    public Double getLatitude() {
        return mGeometry.mCoordinates.get(1);
    }

    public Double getLongitude() {
        return mGeometry.mCoordinates.get(0);
    }
}
