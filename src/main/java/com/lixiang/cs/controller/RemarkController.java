package com.lixiang.cs.controller;

import com.lixiang.cs.service.RemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lixiang on 2016/5/21.
 */
@Controller
@RequestMapping("/hello")
public class RemarkController {

    @Autowired
    private RemarkService remarkService;

    @RequestMapping("/brother")
    @ResponseBody
    public ModelAndView test(ModelAndView model){

        System.out.println("OK");
        model.setViewName("index");
        return model;
    }

}
