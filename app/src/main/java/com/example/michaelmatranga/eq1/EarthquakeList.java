package com.example.michaelmatranga.eq1;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EarthquakeList {

    @SerializedName("features")
    List<EarthquakeProperties> earthquakeList;

}
