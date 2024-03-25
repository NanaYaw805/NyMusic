package com.ulimited.mymusic.Model;

import android.app.Application;
import android.util.Log;

import com.ulimited.mymusic.ServiceAPI.MusicApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MusicRepository {
    private ArrayList<Tracks> tracks = new ArrayList<>();
    private MusicApiService musicApiService;
    private Application application;


    public MusicRepository(Application application) {
        this.tracks = tracks;
        this.musicApiService = musicApiService;
        this.application = application;
    }

    public List<Tracks> getTopTracks(){
        Call<TrackResponse> call = musicApiService.getTopTracks("b4392279e5db6a52e3c8a21677e6a243");
        call.enqueue(new Callback<TrackResponse>() {
            @Override
            public void onResponse(Call<TrackResponse> call, Response<TrackResponse> response) {
                  TrackResponse trackResponse = response.body();
                  if (trackResponse!=null & trackResponse.getTracksList() !=null){
                        tracks = new ArrayList<>(trackResponse.getTracksList());

                  }
            }

            @Override
            public void onFailure(Call<TrackResponse> call, Throwable t) {
                Log.d("failure message","getting top tracks failure");

            }
        });

        return tracks ;
    }


}
