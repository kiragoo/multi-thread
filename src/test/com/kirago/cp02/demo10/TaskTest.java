package com.kirago.cp02.demo10;

import org.junit.Test;

public class TaskTest {
    @Test
    public void run(){
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.start();
        
        ThreadB threadB = new ThreadB(task);
        threadB.start();
    }

}