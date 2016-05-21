package com.lixiang.cs.controller;

import com.lixiang.cs.model.Remark;
import com.lixiang.cs.service.RemarkService;
import com.lixiang.cs.util.ClassifyUtil;
import com.lixiang.cs.util.MyCompare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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

        ClassifyUtil classifyUtil = new ClassifyUtil();
        List<Remark> Remarks = remarkService.selectAll();

        Map<String,Integer> wordMap = classifyUtil.getKeywords(Remarks);



        model.setViewName("index");
        return model;
    }


}
