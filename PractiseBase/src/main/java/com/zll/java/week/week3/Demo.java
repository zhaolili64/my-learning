package com.zll.java.week.week3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/19
 **/
public class Demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm.SSS");

        // 定义两个时间
        String startTime = "1240-6-1 6:6:6.6";
        String endTime = "2020-11-21 8:8:8.8";

        // 将两个String类型的时间转换为Date类型，从而计算差值、parse()方法的作用是将String类型的时间解析为Date类型
        Date d1 = df.parse(startTime);
        Date d2 = df.parse(endTime);

        System.out.println((((d2.getTime() + d1.getTime()) / (24 * 60 * 60 * 1000))) / 365 + "年");
        System.out.println((d2.getTime()+ d1.getTime()) / (24 * 60 * 60 * 1000) + "天");
        System.out.println((((d2.getTime() + d1.getTime()) / (60 * 60 * 1000)) % 24) + "小时");
        System.out.println((((d2.getTime() +d1.getTime()) / 1000) % 60) + "分钟");
        System.out.println(((d2.getTime() + d1.getTime()) / (60 * 1000)) % 60 + "秒");
        System.out.println((((d2.getTime() + d1.getTime())) % 1000) + "毫秒");
    }
}
