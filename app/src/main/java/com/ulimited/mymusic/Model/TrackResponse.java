package com.ulimited.mymusic.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrackResponse {


    @SerializedName("track")
    @Expose
    private List<Tracks> tracksList;

    @SerializedName("@attr")
    @Expose
    private Attr attr;



}

class Attr{
    private String page;
    private String perPage;
    private String totalPages;
    private String total;
}

