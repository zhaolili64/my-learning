package com.zll.java.week.week2;

/**
 * @ClassName Book1
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/12
 **/
public class Data {
    private  String time;

    public  void setTime(String name) {

        this.time = time;
    }

    public  String getTime(){
        return this.time;
    }
    public static void main(String[] args) {
        Data data= new Data();
        data.setTime("2020年10月12日 12：12；12");
        System.out.println(data.time);
    }
}
