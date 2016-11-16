package com.lixiang.aspectj.withinandtar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiang on 10/27/2016.
 */
public class bird {

    public void fly(String a , int b){
        List<String> list = new ArrayList();
        list.add("1");
        System.out.println(list.get(3));
        System.out.println("i am flying");
    }
    public void eat(){
        System.out.println("i am eat");
    }

}
