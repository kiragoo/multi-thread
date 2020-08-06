package com.kirago.cp03.demo08;


import org.junit.Test;

public class ServiceTest {
    
    @Test
    public void run() {
        Service service = new Service();
        MyThread myThreadA = new MyThread(service);
        MyThread myThreadB = new MyThread(service);
        MyThread myThreadC = new MyThread(service);
        MyThread myThreadD = new MyThread(service);
        MyThread myThreadE = new MyThread(service);

        myThreadA.setName("A");
        myThreadB.setName("B");
        myThreadC.setName("C");
        myThreadD.setName("D");
        myThreadE.setName("E");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
        myThreadD.start();
        myThreadE.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}