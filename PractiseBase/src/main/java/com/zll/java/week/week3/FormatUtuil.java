package com.zll.java.week.week3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName FormatUtuil
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/19
 **/
public class FormatUtuil {
    public  static  String format(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat();
        return  sdf.format(date);
    }
    public  static  String format(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(number);
    }
    public  static  String format(Date date, String regex){
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        return sdf.format(date);
    }
}
