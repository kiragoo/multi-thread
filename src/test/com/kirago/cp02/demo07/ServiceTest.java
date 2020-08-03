package com.kirago.cp02.demo07;

import org.junit.Test;

public class ServiceTest {
    
    @Test
    public void run(){
        Service service = new Service();
        MyThread thread = new MyThread(service);
        thread.start();
    }

}