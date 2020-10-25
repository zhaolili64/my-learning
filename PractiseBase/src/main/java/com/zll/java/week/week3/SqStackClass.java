package com.zll.java.week.week3;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName SqStackClass
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/20
 **/
@AllArgsConstructor

public class SqStackClass<E> {
    final int initcapacity = 10;
    private int capacity;
    private E[] data;
    private int top;

    public SqStackClass() {
        data = (E[]) new Objects[initcapacity];
        capacity = initcapacity;
        top = -1;
    }
    public void push(E e) {
        if (top==capacity-1){
            updateCapacity(2 * (top + 1));
        }
        top++;
        data[top] = e;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("栈空");
        }
        E e = (E) data[top];
        top--;
        if (top + 1 > initcapacity && top + 1 == capacity / 4) {
            updateCapacity(capacity / 2);
        }
        return e;
    }

    public int getTopPtr(){
        return top;
    }

    public E peek(){
        if (isEmpty()) {
            throw new IllegalStateException("栈空");
        }
        return data[top];
    }

    public void updateCapacity(int cap) {
        E[] newData = (E[]) new Object[cap];
        for (int i = 0; i < top; i++) {
            newData[i] = data[i];
        }
        capacity = cap;
        data = newData;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

    /*private void updatecapacity(int newcapacity) {
        E[] newdata = (E[]) new Objects[newcapacity];
        for (int i = 0; i < top; i++)
            newdata[i] = data[i];
        capacity = newcapacity;
        data = newdata;
    }

    public boolean Empty() {
        return top == -1;
    }


    public E pop() {
        if (Empty()) {
            System.out.println("栈空");
        }
        E e = (E) data[top];
        top--;

       if (top+1>initcapacity && top+1==capacity/4) {
           updatecapacity(capacity / 2);
           return e;
       }
    }

    public E peek() {
        if (Empty()) {
            System.out.println("栈空");
            return (E) data[top];
        }
    }
}*/
   /*static char[] in={'a','c','d'};

    public static void main(String[] args){
        fun(0,new Stack<Character>(),"");
    }

    static void fun(int n, Stack <Character> stk, String sout)
    {

        if(n == in.length && stk.isEmpty()){
            System.out.println(sout);
        }
        else
        {
            Stack<Character> s1=(Stack<Character>) stk.clone();
            Stack<Character> s2=(Stack<Character>) stk.clone();

            if (n <  in.length) {
                s1.push(in[n]);
                fun(n + 1, s1, sout + "");
            }

            if (!s2.isEmpty()){

                String temp=sout+ s2.peek();
                s2.pop();
                fun(n, s2, temp);
            }
        }
    }*/
