package com.lixiang.aspectj;

/**
 * Created by lixiang on 9/25/2016.
 */
public class testCfow {
    public static void foo(){
        System.out.println("this is  foo");
    }

    public static void bar(){
        foo();
        System.out.println("this is bar");
    }

    public static void main(String[] args) {
        bar();
        foo();
        bar();
    }
}
