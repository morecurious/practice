package com.lixiang.reflectUtils;

import com.lixiang.model.JavaEight.Album;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by lixiang on 11/22/2016.
 */
public class changeType {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.lixiang.model.JavaEight.Album");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getType());

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
