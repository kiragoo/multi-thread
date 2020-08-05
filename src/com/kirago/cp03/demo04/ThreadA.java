package com.kirago.cp03.demo04;

public class ThreadA extends Thread{
    
    private MyList myList;
    
    public ThreadA(MyList myList){
        super();
        this.myList = myList;
    }
    
    @Override
    public void run(){
        try {
            synchronized (myList){
                if(myList.size() != 5){
                    System.out.println(" wait begin " + System.currentTimeMillis());
                    myList.wait();
                    System.out.println(" wait end " + System.currentTimeMillis());
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
