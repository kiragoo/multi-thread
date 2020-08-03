package com.kirago.cp02.demo11;

import org.junit.Test;

public class MyLockOneAndTwoTest {
    
    @Test
    public void run(){
        MyLockOneAndTwo myLockOneAndTwo = new MyLockOneAndTwo();
        ThreadA threadA = new ThreadA(myLockOneAndTwo);
        threadA.start();
        
        ThreadB threadB = new ThreadB(myLockOneAndTwo);
        threadB.start();
        
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}