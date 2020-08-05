package com.kirago.cp03.demo01;

public class ThreadB extends Thread{
    private Service service;
    
    public ThreadB(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        try {
            while (true){
                if(service.getSize() >= 5){
                    System.out.println(">= 5 了,线程 " + Thread.currentThread().getName() + " 要退出了" );
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            
    }
}
