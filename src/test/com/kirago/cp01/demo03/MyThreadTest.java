package com.kirago.cp01.demo03;


import org.junit.Test;

public class MyThreadTest {

    @Test
    public void testMyThread(){
        MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        MyThread myThreadC = new MyThread("C");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
    }

}