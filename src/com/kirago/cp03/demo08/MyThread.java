package com.kirago.cp03.demo08;

public class MyThread extends Thread{
    private Service service;
    
    public MyThread(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        service.run();
    }
}
