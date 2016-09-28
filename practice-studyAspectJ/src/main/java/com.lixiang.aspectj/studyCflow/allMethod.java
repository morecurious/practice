package com.lixiang.aspectj.studyCflow;

/**
 * Created by lixiang on 16-9-28.
 */
public class allMethod {
    public static void main(String[] args) {
        AMethod a = new AMethod();
        BMethod b = new BMethod();
        a.setA();
        b.setB();
        GetABMehtod g = new GetABMehtod();
        g.getAB();
    }
}
