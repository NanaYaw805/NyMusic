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

    public List<Tracks> getTracksList() {
        return tracksList;
    }

    public void setTracksList(List<Tracks> tracksList) {
        this.tracksList = tracksList;
    }

    public Attr getAttr() {
        return attr;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }
}

class Attr{

    @SerializedName("page")
    @Expose
    private String page;

    @SerializedName("perPage")
    @Expose
    private String perPage;

    @SerializedName("totalPages")
    @Expose
    private String totalPages;

    @SerializedName("total")
    @Expose
    private String total;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}

