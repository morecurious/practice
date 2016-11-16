package com.lixiang.aspectj.withinandtar;

import java.util.Arrays;

/**
 * Created by lixiang on 10/27/2016.
 */
public aspect with {

    pointcut aaa(): call(* fly(..))&& within(sky);


    Object around():aaa(){

        StringBuilder paramsb = new StringBuilder();
        Object[] objs = thisJoinPoint.getArgs();
        for (int i = 0; i < objs.length; i++) {
            if(null!=objs[i] && objs[i].getClass().equals(String.class)){
                paramsb.append(objs[i]).append("&");
            }else if(null!=objs[i]&&objs[i].getClass().equals(Integer.class)){
                paramsb.append(String.valueOf(objs[i])).append(" ");
            }
        }
        String params = paramsb.toString().trim();
        System.out.println("params-----: "+params);
        if(params.equals("")){
            System.out.println("OK");
        }
        System.out.println("-------"+thisJoinPoint.getSourceLocation());
        Object obj = null;
        try{
            obj = proceed();
        }catch (Exception ex){
            System.out.println("-----切面中的消息------");
            System.out.println(Arrays.asList(ex.getStackTrace()).toString());
        }finally {
            return obj;
        }


    }
}
