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
    private static String name ;
    private static Map<String,String> map = new HashMap<>();
    static{
        doInit();
    }
    public static void main(String[] args) {



        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        map.put("aaa",null);
        map2.putAll(null);
        System.out.println(map.size());
    }
    public static void captialFirstTwo(String orignStr){
        StringBuffer stringBuffer = new StringBuffer(orignStr);

    }

    public static void doInit(){
      //  name =map.get("ccc");
    }

    public static String insertIntoString(int index,String orignStr,String newStr){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(orignStr.substring(0,index));
        stringBuffer.append(newStr);
        stringBuffer.append(orignStr.substring(index));
        return stringBuffer.toString();
    }
}
