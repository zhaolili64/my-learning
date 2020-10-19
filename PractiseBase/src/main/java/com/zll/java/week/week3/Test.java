package com.zll.java.week.week3;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 86180
 * @Date 10/15/2020
 **/
public class Test {
    public static void main(String[] args) {
        org.spianmo.learn.week3.CPU cpu = new org.spianmo.learn.week3.CPU();
        org.spianmo.learn.week3.HardDisk hardDisk=new org.spianmo.learn.week3.HardDisk();
        cpu.setSpeed(2200);
        hardDisk.setAmount(200);
        org.spianmo.learn.week3.PC pc =new org.spianmo.learn.week3.PC();
        pc.setCpu(cpu);
        pc.setHardDisk(hardDisk);
        pc.show();
    }
}

