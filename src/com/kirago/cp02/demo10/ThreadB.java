package com.kirago.cp02.demo10;

public class ThreadB extends Thread{
    
    private Task task;
    
    public ThreadB(Task task){
        super();
        this.task = task;
    }
    
    @Override
    public void run(){
        super.run();
        task.doLongTimeTask();
    }
}
