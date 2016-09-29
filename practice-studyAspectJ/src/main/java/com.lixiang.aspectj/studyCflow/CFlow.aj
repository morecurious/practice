package com.lixiang.aspectj.studyCflow;

/**
 * Created by lixiang on 16-9-28.
 */
public aspect CFlow {

    pointcut setMethod(): call(* set*(..));

    pointcut inGetABMethod(): withincode(* com.lixiang.aspectj.studyCflow.GetABMehtod.*(..));

  //  pointcut testFlow(int x):cflow(setMethod(int x));

    declare error: setMethod() && !inGetABMethod():"illegal call";

    before():setMethod(){
        System.out.println("in before:");

        System.out.println("enter: "+thisJoinPoint.getSourceLocation());
    }
}
