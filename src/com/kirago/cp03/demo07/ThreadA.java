package com.kirago.cp03.demo07;

public class ThreadA extends Thread{
    
    private Service service;
    
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        service.serviceA();
    }
}
