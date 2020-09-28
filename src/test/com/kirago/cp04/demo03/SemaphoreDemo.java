package com.kirago.cp04.demo03;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    
    public static void main(String[] args){
        Semaphore semaphore = new Semaphore(5,true);
        
        for (int i=0;i<7;i++){
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t 进去吃饭");
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println(Thread.currentThread().getName()  + "\t 吃饭完成离开");
                    semaphore.release();
                } 
            }, String.valueOf(i)).start();
        }
    }
}
