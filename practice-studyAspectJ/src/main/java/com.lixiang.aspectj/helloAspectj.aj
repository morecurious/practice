package com.lixiang.aspectj;

import org.aspectj.lang.reflect.MethodSignature;

public aspect helloAspectj {

    pointcut HelloWorldPointCut(int x) : call(* com.lixiang.aspectj.HelloWorld.test(int))&&target(HelloWorld)&& args(x);

    pointcut barpoint() : execution(* bar(..));

    pointcut fooPoint(): execution(*  foo(..));

    pointcut barCfow() : cflow(barpoint());

    pointcut fooInBar(): barCfow() && fooPoint();


    before(): fooInBar(){
        System.out.println("Enter:" + thisJoinPoint);
    }


    /*before(int x) : HelloWorldPointCut(x){
        System.out.println(thisJoinPoint.getSourceLocation());

        System.out.println("This is before");
    }
    */
    after( int x ) returning: HelloWorldPointCut(x){
        System.out.println("this is after");
    //    System.out.println(he.toString());
    }

    /*int around(int x): HelloWorldPointCut(x){

        System.out.println("enter" +thisJoinPoint.getSourceLocation());
        int newValue = proceed(x+3);
        return newValue;
    }*/
}