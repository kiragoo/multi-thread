package com.kirago.cp02.demo05;

public class ThreadB extends Thread{
    
    private MyObject myObject;
    
    public ThreadB(MyObject myObject){
        super();
        this.myObject = myObject;
    }
    
    @Override
    public void run(){
        super.run();
        myObject.methodB();
    }
}
