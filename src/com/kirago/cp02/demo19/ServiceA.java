package com.kirago.cp02.demo19;

public class ServiceA {
    private boolean tag = true;
    
    public void setTag(boolean tag){
        this.tag = tag;
    }
    
    public void serviceMethod(){
        try {
            while (tag){
                System.out.println("run method name: " + Thread.currentThread().getName());
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
