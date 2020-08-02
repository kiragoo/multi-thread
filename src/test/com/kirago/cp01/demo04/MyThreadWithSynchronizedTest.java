package com.kirago.cp01.demo04;

import org.junit.Test;

public class MyThreadWithSynchronizedTest {

    @Test
    public void run() {
        MyThreadWithSynchronized myThreadWithSynchronized = new MyThreadWithSynchronized();
        Thread a = new Thread(myThreadWithSynchronized, "A");
        Thread b = new Thread(myThreadWithSynchronized, "B");
        Thread c = new Thread(myThreadWithSynchronized, "C");
        a.start();
        b.start();
        c.start();
    }
}