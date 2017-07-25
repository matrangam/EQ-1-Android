package com.example.michaelmatranga.eq1;

import android.util.Log;

import com.example.michaelmatranga.eq1.models.EarthquakeList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

final class EarthquakeService {

    private final String URL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/";
    private static EarthquakeService mInstance = null;

    EarthquakeGetter earthquakeGetter;

    static EarthquakeService getInstance() {
        if (mInstance == null) {
            mInstance = new EarthquakeService();
        }
        return mInstance;
    }

    private EarthquakeService() {
        Retrofit rf = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        earthquakeGetter = rf.create(EarthquakeGetter.class);
    }

    public interface EarthquakeGetter {
        @GET("summary/all_day.geojson")
        Call<EarthquakeList> getAll();
    }
}

