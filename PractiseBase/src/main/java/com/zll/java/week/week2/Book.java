package com.zll.java.week.week2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/12
 **/

@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode()
public class Book {
    /**
     * 封装了name属性
     */
    private  String name;
    /**
     * name的赋值方法
     */
    private  String author;
    private  Integer price;

    public  void setName(String name){
        //给name属性赋值
        this.name = name ;
    }
    public  String getName(){
        //return "hello";
        return this.name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Java");
        System.out.println(book.name);
        //System.out.println(book.toString());
        //System.out.println(book.Getname());
        // System.out.println(book.name);
    }

}
