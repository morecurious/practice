package com.lixiang.aspectj;

/**
 * Created by lixiang on 9/25/2016.
 */
public aspect A {

    pointcut publicCall(): call( String ttt(..));

    after() returning (Object o): publicCall() {
        System.out.println("Returned normally with " + o);
    }
    after() throwing (Exception e): publicCall() {
        System.out.println("Threw an exception: " + e);
    }
    after(): publicCall(){
        System.out.println("Returned or threw an Exception");
    }
}
