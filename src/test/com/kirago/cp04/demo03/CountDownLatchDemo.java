package com.kirago.cp04.demo03;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    private static final int nums = 10;
    
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch countDownLatch = new CountDownLatch(nums);
        for(int i=0;i<nums;i++){
            new Thread(() ->{
                System.out.println(Thread.currentThread().getName() + "\t 上完自习，离开教室");
                countDownLatch.countDown();
//                System.out.println("countdown 数值: " + String.valueOf(countDownLatch.getCount()));
            },String.valueOf(i)).start();
        }
        
        countDownLatch.await();
        System.out.println("班长离开!");
    }
}
