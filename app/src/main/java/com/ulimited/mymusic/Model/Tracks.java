package com.ulimited.mymusic.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serial;
import java.util.List;

public class Tracks {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("duration")
    @Expose
    private int duration;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("streamable")
    @Expose
    private Streamable streamable;

    @SerializedName("artist")
    @Expose
    private Artist artist;

    @SerializedName("image")
    @Expose
    private List<Image> image;


}

class Streamable{
    private String text;
    private String fulltrack;
}


class Artist{
    private String name;
    private String url;
    private String mbid;
}

class Image{
    private String text;
    private String size;
}
