package com.kirago.cp02.demo19;

public class ServiceB extends Thread{
    private boolean tag = true;

    public void setTag(boolean tag){
        this.tag = tag;
    }

    public void serviceMethod(){
        try {
            while (tag){
                System.out.println("inner run method name: " + Thread.currentThread().getName());
                Thread.sleep(2000);
            }
            System.out.println("outter run method name: " + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void run(){
        serviceMethod();
    }
}
