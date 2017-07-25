package com.example.michaelmatranga.eq1;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

final class EarthquakeService {

    private final String URL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/";
    private EarthquakeGetter mEarthquakeGetter;

    EarthquakeService() {

        Retrofit rf = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GsonConverterFactory x = GsonConverterFactory.create();
        x.responseBodyConverter(EarthquakeList.class, null, rf);


        mEarthquakeGetter = rf.create(EarthquakeGetter.class);
    }

    void getAll() {
        mEarthquakeGetter.getAll().enqueue(new Callback<EarthquakeList>() {
            @Override
            public void onResponse(Call<EarthquakeList> call, Response<EarthquakeList> response) {
                Log.d("", "");
            }

            @Override
            public void onFailure(Call<EarthquakeList> call, Throwable t) {
                Log.d("", "");
            }
        });
    }

    private interface EarthquakeGetter {
        @GET("summary/all_day.geojson")
        Call<EarthquakeList> getAll();
    }
}

