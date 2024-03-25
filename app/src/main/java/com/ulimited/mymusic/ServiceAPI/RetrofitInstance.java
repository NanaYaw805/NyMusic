package com.ulimited.mymusic.ServiceAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static Retrofit retrofit;
    public static String BaseURL = "http://ws.audioscrobbler.com/2.0";

    public static MusicApiService getInstance(){
        if (retrofit == null){
             retrofit = new Retrofit.Builder().baseUrl(BaseURL).addConverterFactory(GsonConverterFactory.create())
                     .build();
        }
        return retrofit.create(MusicApiService.class);
    }
}
