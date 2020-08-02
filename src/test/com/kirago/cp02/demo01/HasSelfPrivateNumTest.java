package com.kirago.cp02.demo01;


import org.junit.Test;

public class HasSelfPrivateNumTest {
    
    @Test
    public void run(){
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }

}