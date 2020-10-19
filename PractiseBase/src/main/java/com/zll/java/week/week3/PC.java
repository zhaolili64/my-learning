package com.zll.java.week.week3;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName PC
 * @Description TODO
 * @Author 86180
 * @Date 10/15/2020
 **/
@Setter
@Getter
public class PC {
    org.spianmo.learn.week3.CPU cpu;
    org.spianmo.learn.week3.HardDisk hardDisk;

    void show() {
        System.out.println("CPU速度======>" + cpu.getSpeed());
        System.out.println("硬盘容量======>" + hardDisk.getAmount());
    }
}

