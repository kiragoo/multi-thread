package com.kirago.cp03.demo06;


import org.junit.Test;

public class EntityTest {
    
    @Test
    public void run(){
        try {

            Entity entity = new Entity();
            ThreadP[] threadPs = new ThreadP[2];
            ThreadC[] threadCs = new ThreadC[2];

            for (int i = 0; i < 2; i++) {
                threadPs[i] = new ThreadP(entity);
                threadPs[i].setName("生产者" + (i + 1));

                threadCs[i] = new ThreadC(entity);
                threadCs[i].setName("消费者" + (i + 1));

                threadPs[i].start();
                threadCs[i].start();
            }
            Thread.sleep(5000);
            Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
            for(int i=0;i<threads.length;i++){
                System.out.println(threads[i].getName() + " " + threads[i].getState());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }

}