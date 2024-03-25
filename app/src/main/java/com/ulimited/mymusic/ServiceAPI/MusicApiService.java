package com.ulimited.mymusic.ServiceAPI;

import com.ulimited.mymusic.Model.TrackResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusicApiService {

    @GET("?method=geo.gettoptracks&country=spain&format=json")
    Call<TrackResponse>  getTopTracks(@Query("api_key") String apikey);



}
