package com.lixiang.cs.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiang_linux on 16-5-21.
 */
public class MyCompare implements Comparator<String> {

   Map<String,Integer> map = new HashMap<>();

    public MyCompare(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        if(!map.containsKey(o1)||!map.containsKey(o2))
            return 0;

        if(map.get(o1)<map.get(o2))
            return 1;
        else if (map.get(o1)==map.get(o2))
            return 0;
        else return -1;
    }
}
