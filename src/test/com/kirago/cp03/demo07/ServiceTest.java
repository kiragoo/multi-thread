package com.kirago.cp03.demo07;

import org.junit.Test;

public class ServiceTest {
    
    @Test
    public void run(){
        try {
            Service service = new Service();
            for(int i=0;i<20;i++){

                ThreadA threadA = new ThreadA(service);
                threadA.start();

                ThreadB threadB = new ThreadB(service);
                threadB.start(); 
            }
            
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}