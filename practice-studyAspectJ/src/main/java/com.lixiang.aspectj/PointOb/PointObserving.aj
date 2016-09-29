package com.lixiang.aspectj.PointOb;



import javafx.stage.Screen;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by lixiang on 16-9-28.
 */
public aspect PointObserving {
    private Vector Point.observers = new Vector();

    public static void addObserver(Point p, ScreenObserver s){
        p.observers.add(s);
    }

    public static void removeObserver(Point p, ScreenObserver s ){
        p.observers.remove(s);
    }

    pointcut changes(Point p):target(p) && call(void Point.set*(..));

    after(Point p): changes(p){
        System.out.println("cccccccc");
        Iterator iterator = p.observers.iterator();
        while (iterator.hasNext()){
            updateObserver(p,(ScreenObserver)iterator.next());
            System.out.println("bbbbbbb");
        }
    }

    static void updateObserver(Point p , ScreenObserver s){
        System.out.println("aaaaa");
    }

}
