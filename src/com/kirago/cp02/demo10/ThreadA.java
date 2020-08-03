package com.kirago.cp02.demo10;

public class ThreadA extends Thread{
    private Task task;

    public ThreadA(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run(){
        super.run();
        task.doLongTimeTask();
    }
}
