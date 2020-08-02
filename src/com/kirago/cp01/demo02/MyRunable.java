package com.kirago.cp01.demo02;

public class MyRunable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunable thread name: " + Thread.currentThread().getName());
    }
}
