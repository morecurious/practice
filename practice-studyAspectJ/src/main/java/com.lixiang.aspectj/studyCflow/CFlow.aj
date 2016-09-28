package com.lixiang.aspectj.studyCflow;

/**
 * Created by lixiang on 16-9-28.
 */
public aspect CFlow {

    pointcut setMethod(): call(* set*(..));

    before():setMethod(){
        System.out.println("enter: "+thisJoinPoint.getSourceLocation());
    }
}
