package com.lixiang.aspectj.JoitPoint;

import java.util.Arrays;

/**
 * Created by lixiang on 10/14/2016.
 */
public aspect JoPoint {

  //  pointcut getString(Object obj,Object obj2) : execution(* TestClass.getString(..))&&args(obj,obj2);

    pointcut getString() : execution(* TestClass.*(..));

//    pointcut getInt(Object obj) : call(* getInt(..))&&args(obj);

 //   pointcut testCflow(Object obj1 ,Object obj2) : cflow(getString(obj1,obj2))&&!within(JoPoint);

    /*before(Object obj1,Object obj2) : testCflow(obj1,obj2){
        System.out.println(thisJoinPoint.getKind());
        System.out.println("方法名："+thisJoinPoint.getSignature().getName());
        System.out.println("我在testCflow before 里面"+thisJoinPoint.getSourceLocation());
    }*/

    /*Object around(Object obj,Object obj2): getString(obj,obj2){
        Object[] objss=thisJoinPoint.getArgs();
        System.out.println("从joinPoint中得到的值有："+ Arrays.asList(objss));
        System.out.println("我在 testclass 前面 ");
        System.out.println("从传的值中得到的有: "+obj);
        Object objj = proceed(obj,obj2);
        objj="ddddd";
        System.out.println("我在testclass 后面");
        return objj;

    }*/

    before():getString(){
        System.out.println("我在===="+thisJoinPoint.getSourceLocation());
    }


}
