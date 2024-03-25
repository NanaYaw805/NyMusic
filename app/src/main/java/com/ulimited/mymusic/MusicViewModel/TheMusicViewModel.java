package com.ulimited.mymusic.MusicViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.ulimited.mymusic.Model.MusicRepository;
import com.ulimited.mymusic.Model.Tracks;

import java.util.ArrayList;
import java.util.List;

public class TheMusicViewModel extends AndroidViewModel {
    private MusicRepository musicRepository;
    private List<Tracks> allTracks;

    public TheMusicViewModel(@NonNull Application application) {
        super(application);
        this.musicRepository = new MusicRepository(application);
    }

     public List<Tracks> getAllTracks(){
        if (allTracks == null){
            allTracks = new ArrayList<>();
        }
        allTracks = musicRepository.getTopTracks();
        return allTracks;
     }
}
