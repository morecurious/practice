package javaEight.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by lixiang on 2016/7/2.
 */
public class JudgeType {
    public static void main(String[] args) {

        Predicate<Integer> Least5 = x->x>5;

        System.out.println(Thread.currentThread().getName());
        System.out.println(Least5.test(9));

        BinaryOperator<Long> addLongs = (x,y)->x+y;


        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("running");
        };
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println();
    }



}
