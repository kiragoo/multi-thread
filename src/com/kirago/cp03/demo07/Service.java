package com.kirago.cp03.demo07;

public class Service {
    
    private volatile boolean flag = false;
    
    synchronized public void serviceA(){
        try {
            if(!flag){
                wait();
            }
            for(int i=0;i<5;i++){
                System.out.println("☆☆☆☆☆");
            }
            flag = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    synchronized public void serviceB(){
        try {
            if(false){
                wait();
            }
            for (int i=0;i<5;i++){
                System.out.println("❉❉❉❉❉");
            }
            flag = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
