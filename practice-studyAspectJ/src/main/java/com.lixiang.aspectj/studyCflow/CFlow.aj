package com.lixiang.aspectj.studyCflow;

/**
 * Created by lixiang on 16-9-28.
 */
public aspect CFlow {

    pointcut setMethod(int x): call(* set*(..))&&args(x);

  //  pointcut testFlow(int x):cflow(setMethod(int x));

    before(int x):setMethod(x){
        System.out.println("in before:"+x);

        System.out.println("enter: "+thisJoinPoint.getSourceLocation());
    }
}
