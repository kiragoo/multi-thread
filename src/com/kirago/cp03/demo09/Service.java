package com.kirago.cp03.demo09;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    
    private Lock lock = new ReentrantLock();
    
    private Condition condition = lock.newCondition();
    
    public void await(){
        try {
            lock.lock();
            System.out.println(" await 时间为 " + System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    
    public void signal(){
        try {
            lock.lock();
            System.out.println(" signal 时间为 " + System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
