package com.kirago.cp02.demo19;


import org.junit.Test;

public class ServiceATest {
    
    @Test
    public void testServerA(){
        try {
            ServiceA serviceA = new ServiceA();
            serviceA.serviceMethod();
            System.out.println("开始进行 tag 状态切换");
            serviceA.setTag(false); 
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void testServiceB(){
        try {
            ServiceB serviceB = new ServiceB();
            new Thread(serviceB).start();
            Thread.sleep(5000);
            System.out.println("开始进行 tag 状态切换");
            serviceB.setTag(false);
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        } 
    }

}