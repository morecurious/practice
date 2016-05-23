package com.lixiang.cs.util;

/**
 * Created by lixiang_linux on 16-5-21.
 */


import com.hankcs.hanlp.HanLP;
import com.lixiang.cs.model.Remark;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * util provided for controller
 */
public class ClassifyUtil {

    /**
     * get the keywords from each remark and calculate the word frequency.
     * @param remarks
     */
    public Map<String, Integer> getKeywords(List<Remark> remarks){
        Map<String, Integer> map = new HashMap<>();
        remarks.forEach(remark -> {
            List<String> keywords = HanLP.extractKeyword(remark.getContext(),20);

            keywords.forEach(keyword->{
                if(map.containsKey(keyword)){
                    int a = map.get(keyword);
                    a++;
                    map.put(keyword,a);
                }else{
                    map.put(keyword,1);
                }
            });
        });


        //get a desc order
        MyCompare myCompare = new MyCompare(map);
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet,myCompare);
//      keySet.forEach(keyword-> System.out.println(keyword+" "+map.get(keyword)));

        //output to a file
//        try {
//            FileWriter fw = new FileWriter("/home/li/out.txt");
//            keySet.forEach(keyword->{
//                try {
//                    fw.append(keyword+map.get(keyword)+" ");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return map;
    }



    public void calProbability(Map<String,Integer> map){

        //calculate the sum of the keywords


    }


}

