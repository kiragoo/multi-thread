package com.kirago.cp02.demo07;

import org.junit.Test;

public class MyThread extends Thread{
    
    private Service service;
    public MyThread(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        service.service1();
    }
}
