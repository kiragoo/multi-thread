package com.kirago.cp03.demo08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private Lock lock = new ReentrantLock();
    public void run(){
        lock.lock();
        
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
        lock.unlock();
    }
}
