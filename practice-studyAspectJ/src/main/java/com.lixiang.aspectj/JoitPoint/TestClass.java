package com.lixiang.aspectj.JoitPoint;

/**
 * Created by lixiang on 10/14/2016.
 */
public class TestClass {

    public String getString(String a,String b){

        int aa = Integer.valueOf(a);

        String ac = getInt(aa);

        return ac ;

    }

    public String getInt(int a){
        String b = getIt();
        return String.valueOf(b);
    }


    public String getIt(){
        return "222";
    }


}
