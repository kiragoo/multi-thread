package com.kirago.cp01.demo01;

import org.junit.Test;

public class RandomThreadTest {
    
    @Test
    public void run(){
        try {
            RandomThread randomThread = new RandomThread();
            randomThread.setName("Random Thread");
            randomThread.start();
            for(int i=0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main= " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }
}