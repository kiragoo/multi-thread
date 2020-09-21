package com.kirago.cp03.demo06;


public class ThreadC extends Thread{
    private C c;
    public ThreadC(Entity entity){
        super();
        this.c = new C(entity);
    }
    
    @Override
    public void run(){
        while(true){
            c.getEntity();
        }
    }
}
