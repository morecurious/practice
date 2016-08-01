package com.lixiang.cs.controller;

import com.lixiang.cs.model.Remark;
import com.lixiang.cs.service.RemarkService;
import com.lixiang.cs.util.ClassifyUtil;
import com.lixiang.cs.util.MyCompare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.NumberFormat;
import java.util.*;

/**
 * Created by lixiang on 2016/5/21.
 */
@Controller
@RequestMapping("/hello")
public class RemarkController {

    @Autowired
    private RemarkService remarkService;



    @RequestMapping("")
    @ResponseBody
    public ModelAndView test(ModelAndView model){

    //    ClassifyUtil classifyUtil = new ClassifyUtil();
   //     List<Remark> Remarks = remarkService.selectAll();

   //     Map<String,Integer> wordMap = classifyUtil.getKeywords(Remarks);

        model.setViewName("index");
        return model;
    }

    @RequestMapping("/class")
    @ResponseBody
    public List<String> toClass(@RequestBody Remark remark){

        ClassifyUtil classifyUtil = new ClassifyUtil();
        List<Remark> Remarks = remarkService.selectAll();
        List<Double> dd = classifyUtil.getKeywords(Remarks,remark.getContext());

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(9);
        nf.setGroupingUsed(false);
        Map<String,Integer> fre = new HashMap<>();
        for (int index = 0; index < dd.size(); index++) {
            fre.put(classifyUtil.getNameByStatus(index),(int)(dd.get(index)*1000000000));
        }
        List<String> keyset = new ArrayList<>(fre.keySet());
        Collections.sort(keyset,new MyCompare(fre));
        String s ="";
        for (String lb : keyset) {
            s+=lb+":"+fre.get(lb)+" ";
        }
        List<String> rrr = new ArrayList<>();
        rrr.add(s);
     //   System.out.println(s);
        return rrr;
    }



}
