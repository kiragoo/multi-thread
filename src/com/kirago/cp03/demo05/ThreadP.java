package com.kirago.cp03.demo05;


public class ThreadP extends Thread{
    private P p;
    public ThreadP(Entity entity){
        this.p = new P(entity);
    }
    
    @Override
    public void run(){
        while (true){
            p.setEntity();
        }
    }
}
