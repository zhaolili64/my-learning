package com.zll.java.week.week2;


import java.math.BigDecimal;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author Finger
 * @Date 10/12/2020
 **/
public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("麦田的守望者", "ISBN0001", "J.D.塞林格", new BigDecimal("56"), new java.util.Date());
        Student student1 = new Student("01", "李华", "男", new Phone("魅族", "20p", "123456"), new Book[]{book1});
        Student student2 = new Student("02", "韩梅梅", "女", new Phone("华为", "mate20x", "789546"), new Book[]{book1});
        Student student3 = new Student("03", "江城", "男", new Phone("苹果", "苹果8", "354568"), new Book[]{book1});
        Student student4 = new Student("04", "凫舟", "女", new Phone("oppo", "oppo20puls", "235486"), new Book[]{book1});
        Group group1 = new Group("001", new Student[]{student1, student2, student3, student4});
        for (Student student : group1.getStudent()) {
            System.out.println(student.toString());
        }
    }
}
