package com.lixiang.String;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiang on 2016/8/13.
 */
public class StringUtils {
    public static void main(String[] args) {
        int error= 33;
        String message ="这是一些子东西";
        Map map = new HashMap<>();
        map.put("error",error);
        map.put("message",message);
        String json = JSON.toJSONString(map);
        System.out.println(json);

    }

    public String insert(){
        String a = "{'proStatus':'5','proMsg':'重要信息缺失，验证失败，请返回重试！',}";
        int length = a.length();
        StringBuilder sb = new StringBuilder(a);
        String back = "'forwadUrl':"+"'"+"loginBack"+"'";
        sb.insert(length-1,back);
        String newStr = sb.toString();
        byte[] bs = newStr.getBytes();
        System.out.println(bs);
        return sb.toString();
    }
}
