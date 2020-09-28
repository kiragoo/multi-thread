package com.kirago.cp04.demo03;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    

    
    public static void main(String[] args) {
        CyclicBarrier c = new CyclicBarrier(7, () -> {
            System.out.println("集齐7颗龙珠，召唤神龙!");
        });

        for (int i = 0; i < 8; i++) {
            final int tmp = 1;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "收集到第 " + tmp + " 颗龙珠");

                try {
                    c.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
