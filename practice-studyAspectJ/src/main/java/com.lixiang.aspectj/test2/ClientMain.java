package com.lixiang.aspectj.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiang on 9/27/2016.
 */
public class ClientMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Snake());
        animals.add(new Bird());
        new Move().move(animals);
    }
}
