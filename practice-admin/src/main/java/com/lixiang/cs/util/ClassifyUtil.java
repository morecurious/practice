package com.lixiang.cs.util;

/**
 * Created by lixiang_linux on 16-5-21.
 */


import com.hankcs.hanlp.HanLP;
import com.lixiang.cs.model.Remark;

import java.text.NumberFormat;
import java.util.*;

/**
 * util provided for controller
 */
public class ClassifyUtil {

    /**
     * get the keywords from each remark and calculate the word frequency.
     * @param remarks
     */
    public List<Double> getKeywords(List<Remark> remarks,String context){
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

        List<HashMap<String,Integer>> class_list = new ArrayList<>();
        HashMap<String,Integer> map_logistical = new HashMap<>();
        HashMap<String,Integer> map_qulity = new HashMap<>();
        HashMap<String,Integer> map_service = new HashMap<>();
        HashMap<String,Integer> map_bad = new HashMap<>();
        HashMap<String,Integer> map_pretty = new HashMap<>();
        HashMap<String,Integer> map_neutral = new HashMap<>();
        HashMap<String,Integer> map_price = new HashMap<>();
        class_list.add(map_logistical);class_list.add(map_qulity);class_list.add(map_service);
        class_list.add(map_bad);class_list.add(map_pretty);class_list.add(map_neutral);class_list.add(map_price);
        for (Remark remark : remarks) {
            List<String> keyword = HanLP.extractKeyword(remark.getContext(),100);
            for (String s : keyword) {
                if(class_list.get(remark.getStatus()).containsKey(s)){
                    int value = class_list.get(remark.getStatus()).get(s);
                    value++;
                    class_list.get(remark.getStatus()).put(s,value);
                }else{
                    class_list.get(remark.getStatus()).put(s,1);
                }

            }
        }

        List<HashMap<String,Double>> pre_class_list = new ArrayList<>();
        HashMap<String,Double> pre_logistical = new HashMap<>();
        HashMap<String,Double> pre_qulity = new HashMap<>();
        HashMap<String,Double> pre_service = new HashMap<>();
        HashMap<String,Double> pre_bad = new HashMap<>();
        HashMap<String,Double> pre_pretty= new HashMap<>();
        HashMap<String,Double> pre_neutral= new HashMap<>();
        HashMap<String,Double> pre_price= new HashMap<>();
        pre_class_list.add(pre_logistical);pre_class_list.add(pre_qulity);pre_class_list.add(pre_service);
        pre_class_list.add(pre_bad);pre_class_list.add(pre_pretty);pre_class_list.add(pre_neutral);
        pre_class_list.add(pre_price);

        //计算P（a|物流）
        for (int index = 0; index < class_list.size(); index++) {
            HashMap<String,Integer> temp = class_list.get(index);
            List<String> keyword = new ArrayList<>(temp.keySet());
            for (String word : keyword) {
                int value = temp.get(word);
                pre_class_list.get(index).put(word,value/getFreByStatus(index));
            }
        }


        List<String> keyword = HanLP.extractKeyword(context,100);
        List<Double> dd = new ArrayList<>();
        dd.add(0.0);dd.add(0.0);dd.add(0.0);
        dd.add(0.0);dd.add(0.0);dd.add(0.0);
        dd.add(0.0);

        for (int index = 0; index < dd.size(); index++) {
            double all = 0;
            for (String word : keyword) {
                if(pre_class_list.get(index).containsKey(word)){
                    all+=pre_class_list.get(index).get(word);
                }
            }
            all*=getFreByStatus(index)/3282;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumFractionDigits(9);
            nf.setGroupingUsed(false);
            dd.set(index,Double.valueOf(nf.format(all)));
        }
        int a=0;
        return dd;
    }


    /**
     * calculate logistical ,quality and so on.
     * @param map
     */
    public void calProbability(Map<String,Integer> map){

        //calculate the sum of the keywords
        int sum =0;

        List<String> keySet = new ArrayList<>(map.keySet());
        for (String keyWord : keySet) {
            sum+=map.get(keyWord);
        }

    }


    public double getFreByStatus(int status){
        switch (status){
            case 0:return 317.0412;
            case 1:return 92.8806;
            case 2:return 75.486;
            case 3:return 27.2406;
            case 4:return 2166.12;
            case 5:return 27.2406;
            case 6:return 0.005;
            default: return 0;
        }
    }

    public String getNameByStatus(int status){
        switch (status){
            case 0:return "物流";
            case 1:return "质量";
            case 2:return "服务";
            case 3:return "差评";
            case 4:return "好评";
            case 5:return "中评";
            case 6:return "价格";
            default: return "";
        }
    }


}

