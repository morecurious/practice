package com.lixiang.studyThread;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by lixiang on 11/27/2016.
 */
public class UnSafeHashMap {
    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<>(2);
        //线程里面套着线程，相当于10000个线程对同一个map执行插入操作
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(),"");
                        }
                    },"ftf"+i).start();
                }
            }
        },"ftf");
        t.start();
        t.join();

    }
}
