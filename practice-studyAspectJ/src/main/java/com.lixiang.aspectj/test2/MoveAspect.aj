package com.lixiang.aspectj.test2;

/**
 * Created by lixiang on 9/27/2016.
 */
public aspect MoveAspect {
    pointcut Moveaspect(Animal ai):call(* move(..))&&target(ai);

    before(Animal ai): Moveaspect(ai){
        System.out.println("enter:"+thisJoinPoint.getSourceLocation());
        System.out.println(ai);
    }

    after(Animal ai) returning:Moveaspect(ai){
        System.out.println("2"+ai);
    }
}
