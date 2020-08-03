package com.kirago.cp02.demo05;


import org.junit.Test;

public class MyObjectTest {
    @Test
    public void run(){
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadB.start();
    }

}