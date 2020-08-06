package com.kirago.cp03.demo09;

import org.junit.Test;


public class ServiceTest {

    @Test
    public void run(){
        Service service = new Service();
        MyThread myThread = new MyThread(service);
        myThread.start();
        
        try {
            Thread.sleep(5000);
            service.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}