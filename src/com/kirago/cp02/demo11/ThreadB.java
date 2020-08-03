package com.kirago.cp02.demo11;

public class ThreadB extends Thread{
    
    private MyLockOneAndTwo myLockOneAndTwo;
    
    public ThreadB(MyLockOneAndTwo myLockOneAndTwo){
        super();
        this.myLockOneAndTwo = myLockOneAndTwo;
    }
    
    @Override
    public void run(){
        super.run();
        myLockOneAndTwo.methodB();
    }
}
