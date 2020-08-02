package com.kirago.cp01.demo04;


import org.junit.Test;

public class MyThreadNotUseSynchronizedTest {
    
    @Test
    public void run(){
        MyThreadNotUseSynchronized myThreadNotUseSynchronized = new MyThreadNotUseSynchronized();
        
        Thread a = new Thread(myThreadNotUseSynchronized, "A");
        Thread b = new Thread(myThreadNotUseSynchronized, "B");
        Thread c = new Thread(myThreadNotUseSynchronized, "C");
        a.start();
        b.start();
        c.start();
    }

}