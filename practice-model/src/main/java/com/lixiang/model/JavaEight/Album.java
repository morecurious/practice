package com.lixiang.model.JavaEight;

import java.util.Set;
/**
 * Created by lixiang on 2016/8/7.
 */
public class Album {
    /*the name of the album*/
    private String name;

    private Set tracks;

    private Set musicians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getTracks() {
        return tracks;
    }

    public void setTracks(Set tracks) {
        this.tracks = tracks;
    }

    public Set getMusicians() {
        return musicians;
    }

    public void setMusicians(Set musicians) {
        this.musicians = musicians;
    }
}
