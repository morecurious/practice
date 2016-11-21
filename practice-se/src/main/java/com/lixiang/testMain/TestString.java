package com.lixiang.testMain;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lixiang on 10/21/2016.
 */
public class TestString {
    public static void main(String[] args) {

        String a = "aaaaa";

        System.out.println(insertIntoString(1,a,"b"));
    }
    public static void captialFirstTwo(String orignStr){
        StringBuffer stringBuffer = new StringBuffer(orignStr);

    }

    public static String insertIntoString(int index,String orignStr,String newStr){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(orignStr.substring(0,index));
        stringBuffer.append(newStr);
        stringBuffer.append(orignStr.substring(index));
        return stringBuffer.toString();
    }
}
