package com.kirago.cp04.demo02;

import org.junit.Test;

import java.util.concurrent.locks.Condition;


public class AwaitSignalTest {

    @Test
    public void print() {
        AwaitSignal awaitSignal = new AwaitSignal(3);
        Condition a = awaitSignal.newCondition();
        Condition b = awaitSignal.newCondition();
        Condition c = awaitSignal.newCondition();
        
        new Thread(() -> {
            awaitSignal.print("a", a, b);
        }).start();
        
        new Thread(() -> {
            awaitSignal.print("b", b, c);
        }).start();
        
        new Thread(() -> {
            awaitSignal.print("c", c, a);
        }).start();
        
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        awaitSignal.lock();
        try {
            a.signal();
        }finally {
            awaitSignal.unlock();
        }
    }
}