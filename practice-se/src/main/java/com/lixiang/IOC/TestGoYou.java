package com.lixiang.IOC;


import com.lixiang.Beans.Tracks;
import com.lixiang.annotion.GoYou;


/**
 * Created by lixiang on 2016/8/7.
 */
public class TestGoYou {
    @GoYou
    private Tracks tracks;

    public static void main(String[] args) {
        System.out.println("aaa");
    }
}
