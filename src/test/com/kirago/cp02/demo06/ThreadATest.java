package com.kirago.cp02.demo06;


import org.junit.Test;

public class ThreadATest {
    
    @Test
    public void run(){
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200); 
            publicVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}