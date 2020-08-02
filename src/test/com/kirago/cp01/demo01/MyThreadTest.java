package com.kirago.cp01.demo01;
import org.junit.Test;

public class MyThreadTest {

    @Test
    public void run() {
        MyThread myThread = new MyThread();
        myThread.run();
        System.out.println("运行结束！");
    }
}