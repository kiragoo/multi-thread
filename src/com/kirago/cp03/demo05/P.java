package com.kirago.cp03.demo05;

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
                    entity.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                entity.setValue(value);
                System.out.println(" set 值是 " + value);
                entity.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
