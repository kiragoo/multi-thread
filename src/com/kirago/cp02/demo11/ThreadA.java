package com.kirago.cp02.demo11;

public class ThreadA extends Thread{
    
    private MyLockOneAndTwo myLockOneAndTwo;
    
    public ThreadA(MyLockOneAndTwo myLockOneAndTwo){
        super();
        this.myLockOneAndTwo = myLockOneAndTwo;
    }
    
    @Override
    public void run(){
        super.run();
        myLockOneAndTwo.methodA();
    }
}
