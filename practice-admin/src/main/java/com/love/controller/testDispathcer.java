package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by lixiang on 2016/7/26.
 */
@Controller
@RequestMapping("/hello")
public class testDispathcer {


    @RequestMapping("test")
    @ResponseBody
    public void testDispathcer(){
        System.out.println("你好啊");
    }
}
