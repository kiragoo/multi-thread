package com.kirago.cp02.demo16;

public class Service {
    
    synchronized public static void methodA(){
        try {
            System.out.println("Thread name: " + Thread.currentThread().getName()
                    + " 进入时间 methodA" + System.currentTimeMillis()
            ); 
            Thread.sleep(3000);
            System.out.println("Thread name: " + Thread.currentThread().getName()
                    + " 离开时间 methodA" + System.currentTimeMillis()
            );
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    synchronized public static void methodB(){
        try {
            System.out.println("Thread name: " + Thread.currentThread().getName()
                    + " 进入时间 methodB" + System.currentTimeMillis()
            );
            Thread.sleep(3000);
            System.out.println("Thread name: " + Thread.currentThread().getName()
                    + " 离开时间 methodB" + System.currentTimeMillis()
            );
        }catch (InterruptedException e){
            e.printStackTrace();
        } 
    }
}
