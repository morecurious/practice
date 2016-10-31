package com.lixiang.aspectj.JoitPoint;

import java.util.logging.Logger;

/**
 * Created by lixiang on 10/14/2016.
 */
public class Main {
//    private static Logger logger = Logger.getLogger(this.getClass().getName());
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        String c =tc.getString("111","bbb");
        System.out.println(c);
    }
}
