package com.kirago.cp03.demo09;

public class MyThread extends Thread{
    
    private Service service;
    
    public MyThread(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        service.await();
    }
}
