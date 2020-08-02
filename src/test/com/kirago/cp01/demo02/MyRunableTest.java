package com.kirago.cp01.demo02;


import org.junit.Test;

public class MyRunableTest {
    
    @Test
    public void run(){
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable, "myrunable");
        thread.start();
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }

}