package com.lixiang.aspectj.withinandtar;

/**
 * Created by lixiang on 10/27/2016.
 */
public aspect with {

    pointcut aaa(): call(* fly(..))&& within(sky);


    Object around():aaa(){

        StringBuilder paramsb = new StringBuilder();
        Object[] objs = thisJoinPoint.getArgs();
        for (int i = 0; i < objs.length; i++) {
            if(null!=objs[i]&&objs[i].getClass().equals(String.class)){
                paramsb.append(objs[i]+"&");
            }else if(null!=objs[i]&&objs[i].getClass().equals(int.class)){
                paramsb.append(String.valueOf(objs[i])+" ");
            }
        }
        String params = paramsb.toString().trim();
        System.out.println("params-----: "+params);
        if(params.equals("")){
            System.out.println("OK");
        }
        System.out.println("-------"+thisJoinPoint.getSourceLocation());
        Object obj = proceed();
        return obj;
    }
}
