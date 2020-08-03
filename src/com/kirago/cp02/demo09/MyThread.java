package com.kirago.cp02.demo09;

public class MyThread extends Thread{
    private Sub sub;
    
    public MyThread(Sub sub){
        super();
        this.sub = sub;
    }
    
    @Override
    public void run(){
        sub.serviceMethod();
    }
    
}
