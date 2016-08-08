package com.lixiang.model.JavaEight;


import com.lixiang.annotation.GoYou;

/**
 * Created by lixiang on 2016/8/7.
 */
public class Track {
    /*the name of the track*/
    @GoYou
    private String name;

    private int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
