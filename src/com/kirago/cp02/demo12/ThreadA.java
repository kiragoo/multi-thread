package com.kirago.cp02.demo12;

public class ThreadA extends Thread{
    private Service service;
    
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        service.setUsernameAndPassword("a", "aa");
    }
}
