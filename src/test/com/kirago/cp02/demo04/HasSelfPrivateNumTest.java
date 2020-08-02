package com.kirago.cp02.demo04;


import org.junit.Test;

public class HasSelfPrivateNumTest {
    @Test
    public void run(){
        HasSelfPrivateNum hasSelfPrivateNumA = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNumB = new HasSelfPrivateNum();
        Thread threadA = new ThreadA(hasSelfPrivateNumA);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNumB);
        threadB.start();
    }

}