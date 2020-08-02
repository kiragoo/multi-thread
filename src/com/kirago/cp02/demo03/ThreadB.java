package com.kirago.cp02.demo03;

public class ThreadB extends Thread{
    
    private HasSelfPrivateNum hasSelfPrivateNum;
    
    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    } 
    
    @Override
    public void run(){
        super.run();
        hasSelfPrivateNum.add("b");
    }
}
