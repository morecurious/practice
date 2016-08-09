package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by lixiang on 2016/7/26.
 */
@Controller
@RequestMapping(value = "/begin")
public class testDispathcer {


    @RequestMapping(value = "/test")
    public ModelAndView testDispathcer(){
        int a =0;
        System.out.println("hello");
        return new ModelAndView("begin");
    }
}
