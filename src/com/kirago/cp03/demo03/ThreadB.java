package com.kirago.cp03.demo03;

public class ThreadB extends Thread{
    
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock = lock;
    }
    
    @Override
    public void run(){
        try {
            synchronized (lock){
                System.out.println(" Thread name: " + Thread.currentThread().getName() + " begin!");
                lock.notify();
                System.out.println("Thread name: " + Thread.currentThread().getName() + " end !");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
