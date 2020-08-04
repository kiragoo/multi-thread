package com.kirago.cp02.demo16;


import org.junit.Test;

public class ServiceTest {
    
    @Test
    public void run(){
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
        
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}