package com.lixiang.javaEight.day2Stream;

import com.lixiang.model.JavaEight.Artist;
import com.lixiang.model.JavaEight.ModelFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * Created by lixiang on 8/24/2016.
 */
public class studyStream {

    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1,2,3).map(x-> x+=1).collect(Collectors.toList());

        collect.forEach(x-> System.out.println(x));
    }


    public static void studyFilter(){
        List<Artist> artists = ModelFactory.getAritists();
        long count = artists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return true;
        }).count();
        System.out.println(count);
    }
}