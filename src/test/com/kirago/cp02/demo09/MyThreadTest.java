package com.kirago.cp02.demo09;


import org.junit.Test;

public class MyThreadTest {
    
    @Test
    public void run(){
        Sub sub = new Sub();
        MyThread myThreadA = new MyThread(sub);
        myThreadA.setName("A");
        myThreadA.start();
        
        MyThread myThreadB = new MyThread(sub);
        myThreadB.setName("B");
        myThreadB.start();
        try {
            Thread.sleep(20000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}