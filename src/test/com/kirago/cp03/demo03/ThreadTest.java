package com.kirago.cp03.demo03;


import org.junit.Test;

public class ThreadTest {
    
    @Test
    public void run() {
        try {

            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.setName("A");
            threadA.start();

            ThreadB threadB = new ThreadB(lock);
            threadB.setName("B");
            threadB.start();

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}