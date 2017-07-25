package com.example.michaelmatranga.eq1.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EarthquakeList {

    @SerializedName("features")
    List<EarthquakeProperties> earthquakeList;

    public List<EarthquakeProperties> getEarthquakeList() {
        return earthquakeList;
    }
}
