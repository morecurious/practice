package com.lixiang.aspectj.PointOb;


import static com.lixiang.aspectj.PointOb.PointObserving.addObserver;

/**
 * Created by lixiang on 16-9-28.
 */
public class PointClient {
    public static void main(String[] args) {
        Point p = new Point();
        ScreenObserver so = new ScreenObserver();
        addObserver(p,so);
//        p.setLocation(3,4);
        System.out.println(p);
    }
}
