package com.kirago.cp02.demo15;


import org.junit.Test;

public class MyOneListTest {
    
    @Test
    public void run(){
        MyOneList myOneList = new MyOneList();
        ThreadA threadA = new ThreadA(myOneList);
        threadA.setName("A");
        threadA.start();
        
        ThreadB threadB = new ThreadB(myOneList);
        threadB.setName("B");
        threadB.start();
        try {
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("List size: " +  myOneList.getSize());
        
    }

}