package com.kirago.cp03.demo06;


public class C extends Thread{
    
    private Entity entity;
    
    public C(Entity entity){
        super();
        this.entity = entity;
    }
    
    public void getEntity(){
        try {
            synchronized (entity){
                if(entity.getValue().equals("")){
                    System.out.println(" 消费者 " + Thread.currentThread().getName() + "WAITING ☆");
                    entity.wait();
                }
                System.out.println(" 消费者 " + Thread.currentThread().getName() + "RUNABLE 了");
                entity.setValue("");
                entity.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
