package com.kirago.cp02.demo15;

public class ThreadB extends Thread{
    
    private MyOneList myOneList;
    
    public ThreadB(MyOneList myOneList){
        super();
        this.myOneList = myOneList;
    }
    
    @Override
    public void run(){
        MyService myService = new MyService();
        myService.addServiceMethod(myOneList, "B");
    }
}
