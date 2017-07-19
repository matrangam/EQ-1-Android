package com.example.michaelmatranga.eq1;

import android.util.Log;

import org.json.JSONObject;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

class EarthquakeDataProvider {
    private final String URL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson";

    JsonObjectRequest getRequest() {
        return jsObjRequest;
    }

    private final JsonObjectRequest jsObjRequest = new JsonObjectRequest(Request.Method.GET, URL, null,
        new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("", response.toString());
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub
                Log.d("", error.toString());
            }
        }
    );
}
