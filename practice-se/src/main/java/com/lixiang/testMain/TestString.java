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
        Map<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("a","a");
        map.put("a","c");
        System.out.println(map.toString());

        List<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list.toString());
    }
}
