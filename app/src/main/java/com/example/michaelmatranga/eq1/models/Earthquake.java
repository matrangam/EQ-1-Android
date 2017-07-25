package com.example.michaelmatranga.eq1.models;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Earthquake {

    @SerializedName("properties")
    private EarthquakeDetails mProperties;

    @SerializedName("geometry")
    private Geometry mGeometry;

    class Geometry {
        @SerializedName("coordinates")
        private List<Double> mCoordinates;
    }

    private Double getLatitude() {
        return mGeometry.mCoordinates.get(1);
    }

    private Double getLongitude() {
        return mGeometry.mCoordinates.get(0);
    }

    public LatLng getPosition() {
        return new LatLng(getLatitude(), getLongitude());
    }

    public String getTitle() {
        return mProperties.getTitle();
    }
}
