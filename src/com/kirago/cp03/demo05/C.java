package com.kirago.cp03.demo05;


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
                    entity.wait();
                }
                System.out.println(" get 值是" + entity.getValue());
                entity.setValue("");
                entity.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
