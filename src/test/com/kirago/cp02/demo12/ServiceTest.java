package com.kirago.cp02.demo12;


import org.junit.Test;

public class ServiceTest {
    
    @Test
    public void run(){
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
        
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}