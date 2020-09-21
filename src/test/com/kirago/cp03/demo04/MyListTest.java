package com.kirago.cp03.demo04;


import org.junit.Test;

public class MyListTest {
    
    @Test
    public void run(){
        try {
            MyList myList = new MyList();
            ThreadA threadA = new ThreadA(myList);
            threadA.start();
            
            ThreadB threadB = new ThreadB(myList);
            threadB.start();
            
            Thread.sleep(14000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}