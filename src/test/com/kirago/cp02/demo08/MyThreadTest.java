package com.kirago.cp02.demo08;

import org.junit.Test;

public class MyThreadTest {
    
    @Test
    public void run(){
        MyThread myThread = new MyThread();
        myThread.start();
    }

}