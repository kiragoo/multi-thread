package com.kirago.cp02.demo02;


import org.junit.Test;

public class HasSelfPrivateNumTest {
    
    @Test
    public void run() {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        Thread a = new ThreadA(hasSelfPrivateNum);
        a.start();
        Thread b = new ThreadB(hasSelfPrivateNum);
        b.start();
    }

}