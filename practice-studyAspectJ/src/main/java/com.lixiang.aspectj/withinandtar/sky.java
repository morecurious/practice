package com.lixiang.aspectj.withinandtar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiang on 10/27/2016.
 */
public class sky {

    public  bird bb  = new bird();

    public void stage(String a , int b){
        a  ="abc";
        b =3;

        bb.fly(a,b);
    }
}
