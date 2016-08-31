package com.lixiang.NormalUtils;

/**
 * Created by lixiang on 8/31/2016.
 */
public class fastOrder {

    public static void main(String[] args) {
       //fast();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"a");
            for (int j = 0; j < 5; j++) {
                System.out.println(j+"j");
                if(j==3){
                    break;
                }
            }
        }
    }


    public  static void fast(){
        int length=10;
        int[] nums =new int[length];
        //默认哨兵为第一个数
        int sentry = 0;

        int stop =0;

        //随机生成10个100以内的数字
        for (int i = 0; i < length; i++) {
            nums[i]=(int)(Math.random()*100);
        }

        //开始左右循环
        for (int i = 0; i < length; i++) {
            for (int j = length-1; j >= 0; j--) {
                //如果右边的数比哨兵小
                if(nums[j]<nums[sentry]){
                    stop=j;
                    continue;
                }
            }
        }

    }

}
