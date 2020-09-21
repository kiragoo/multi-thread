package com.kirago.cp03.demo05;

import org.junit.Test;

public class EntityTest {
    
    @Test
    public void run(){
        try {
            Entity entity = new Entity();
            ThreadP threadP = new ThreadP(entity);
            threadP.setName("P");
            threadP.start(); 
            
            ThreadC threadC = new ThreadC(entity);
            threadC.setName("C");
            threadC.start();
            
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
