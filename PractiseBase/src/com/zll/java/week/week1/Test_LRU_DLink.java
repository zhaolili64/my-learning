package com.zll.java.week.week1;

/**
 * @ClassName Test_LRU_DLink
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/7
 **/
public class Test_LRU_DLink {
    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6};
        DLinkListClass<Integer> list = new DLinkListClass<>(input);
        System.out.println(list);
        list.find(4);
        list.find(6);
        list.find(4);
        list.find(4);
        list.find(4);
        System.out.println(list);
    }
}


