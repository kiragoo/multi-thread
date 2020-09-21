package com.kirago.cp03.demo06;

public class P  {
    
    private Entity entity;
    public P(Entity entity){
        super();
        this.entity = entity ;
    }
    
    public void setEntity(){
        try {
            synchronized (entity){
                if (!entity.getValue().equals("")){
                    System.out.println("生产者 " + Thread.currentThread().getName() + " WAITING ☆");
                    entity.wait();
                }
                System.out.println("生产者 " + Thread.currentThread().getName() + " RUNABLE");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                entity.setValue(value);
                entity.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
