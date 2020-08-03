package com.kirago.cp02.demo08;

public class MyThread extends Thread{
    
    @Override
    public void run(){
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
