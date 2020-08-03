package com.kirago.cp02.demo14;

public class Service {
    
    private String anything = new String();
    
    public void methodA(){
        try {
            synchronized (anything){
                System.out.println("Thread name: " + Thread.currentThread().getName() 
                    + System.currentTimeMillis() + " 进入代码块"
                );
                Thread.sleep(2000);
                System.out.println("Thread name: " + Thread.currentThread().getName()
                    + System.currentTimeMillis() + " 进入代码块"
                );
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    synchronized public void methodB(){
        System.out.println(" Thread name: " + Thread.currentThread().getName()
            + System.currentTimeMillis() + " 进入代码块"
        );
        System.out.println(" Thread name: " + Thread.currentThread().getName()
                + System.currentTimeMillis() + " 离开代码块"
        );
    }
}
