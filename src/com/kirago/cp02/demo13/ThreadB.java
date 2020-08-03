package com.kirago.cp02.demo13;

public class ThreadB extends Thread{
    
    private Service service;
    
    public ThreadB(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        service.setUsernameAndPassword("b", "bb");
    }
}
