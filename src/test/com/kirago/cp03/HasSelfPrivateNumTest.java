package com.kirago.cp03;

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