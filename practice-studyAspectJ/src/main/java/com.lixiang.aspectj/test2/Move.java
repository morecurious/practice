package com.lixiang.aspectj.test2;

import java.util.List;

/**
 * Created by lixiang on 9/27/2016.
 */
public class Move {
    public void move(List<Animal> animals){
        for (Animal animal : animals) {
            animal.move();
        }
    }

}
