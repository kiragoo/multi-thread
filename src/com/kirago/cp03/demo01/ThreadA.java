package com.kirago.cp03.demo01;

public class ThreadA extends Thread{
    
    private Service service;
    
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    
    @Override
    public void run(){
        try {
            
            for(int i= 0;i<10;i++){
                service.add();
                System.out.println("list 添加了 " + (i+1) + " 个 元素");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
