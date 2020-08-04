package com.kirago.cp02.demo21;


import org.junit.Test;

public class MyAtomicIntegerTest {
    
    @Test
    public void run(){
        try {
            MyAtomicInteger myAtomicInteger = new MyAtomicInteger();
            Thread thread = new Thread(myAtomicInteger);
            thread.start();

            Thread thread1 = new Thread(myAtomicInteger);
            thread1.start(); 
            
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}