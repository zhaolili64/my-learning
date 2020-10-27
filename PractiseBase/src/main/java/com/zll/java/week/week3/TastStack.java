package com.zll.java.week.week3;

import lombok.Getter;

import java.util.Stack;

/**
 * @ClassName TastStack
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/20
 **/
@Getter
public class TastStack {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            Integer popInteger = stack.pop();
          //  System.out.println("┐（─__─）┌出栈元素为：" + popInteger + "此时栈顶指针为：" + stack.getTopPtr());
            stack.push(5);
            stack.push(5);
            stack.push(5);
            stack.push(6);

            System.out.println("d(ŐдŐ๑)栈内部：" + stack);
        }
}
