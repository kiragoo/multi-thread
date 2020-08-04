package com.kirago.cp02.demo16;

public class ThreadB extends Thread{
    
    
    
    @Override
    public void run(){
        Service.methodB();
    }
}
