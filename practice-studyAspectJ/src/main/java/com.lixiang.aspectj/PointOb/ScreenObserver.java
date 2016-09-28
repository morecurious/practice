package com.lixiang.aspectj.PointOb;

import sun.awt.X11.Screen;

/**
 * Created by lixiang on 16-9-28.
 */
public class ScreenObserver extends Screen{


    public void say(){
        System.out.println("I got you");
    }
}
