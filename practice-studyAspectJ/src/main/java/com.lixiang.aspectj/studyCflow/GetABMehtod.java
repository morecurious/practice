package com.lixiang.aspectj.studyCflow;

/**
 * Created by lixiang on 16-9-28.
 */
public class GetABMehtod {
    public void getAB(){
        AMethod a = new AMethod();
        BMethod b = new BMethod();
        a.setA(3);
        b.setB();
    }
}
