package com.kirago.cp03.demo03;

public class ThreadA extends Thread{
    private Object lock;
    
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }
    
    @Override
    public void run(){
        try {
            synchronized (lock){
                System.out.println("Thread name: " + Thread.currentThread().getName() + " begin !");
                lock.wait();
                System.out.println("Thread name: " + Thread.currentThread().getName() + " end !");
            } 
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
