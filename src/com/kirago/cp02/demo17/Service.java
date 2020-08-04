package com.kirago.cp02.demo17;

public class Service {
    
    public static void service(String string){
        try {
            synchronized (string){
                while(true){
                    System.out.println("Thread name: "+ Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }
}
