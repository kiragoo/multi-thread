package com.kirago.cp02.demo16;

public class ThreadA extends Thread{
    
    
    @Override
    public void run(){
        Service.methodA();
    }
}
