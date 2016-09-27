package com.lixiang.aspectj.test2;

/**
 * Created by lixiang on 9/27/2016.
 */
public class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("bird is fly");
    }
}
