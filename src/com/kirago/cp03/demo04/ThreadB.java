package com.kirago.cp03.demo04;

public class ThreadB extends Thread{
    private MyList myList;
    
    public ThreadB(MyList myList){
        super();
        this.myList = myList;
    }
    
    @Override
    public void run(){
        try {
            synchronized (myList){
                for(int i=0;i<10;i++){
                    myList.add();
                    if(myList.size() == 5){
                        myList.notify();
                        System.out.println(" 已经发出通知！");
                    }
                    System.out.println("添加了 " + myList.size() + " 个元素");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
