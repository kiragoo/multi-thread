package com.kirago.cp04.demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignal extends ReentrantLock {
    
    private int loopNumber;
    
    public AwaitSignal(int loopNumber){
        this.loopNumber = loopNumber;
    }
    
    public void print(String print, Condition current, Condition next){
        for(int i=0;i<loopNumber;i++){
            lock();
            try {
                try {
                    current.await();
                    System.out.println(print);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                next.signal();
            }finally {
                unlock();
            }
        }
    }
}
