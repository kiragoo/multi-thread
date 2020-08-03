package com.kirago.cp02.demo15;

public class ThreadA extends Thread{
    
    private MyOneList myOneList;
    
    public ThreadA(MyOneList myOneList ){
        super();
        this.myOneList = myOneList;
    }
    
    @Override
    public void run(){
        MyService myService = new MyService();
        myService.addServiceMethod(myOneList, "A");
    }
}
