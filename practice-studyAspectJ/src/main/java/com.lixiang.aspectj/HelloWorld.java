package com.lixiang.aspectj;

/**
 * Created by lixiang on 9/23/2016.
 */
public class HelloWorld {

    public static void main(String[] args) {
        int a = 1;
        int b = test(a);
        System.out.println(b);
        System.out.println("this is in the main");

    }

    public static int test(int a){
        System.out.println("this is in the test");
        System.out.println(a);
        return a;
    }

}
