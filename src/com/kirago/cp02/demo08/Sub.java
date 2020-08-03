package com.kirago.cp02.demo08;

public class Sub extends Main{
    synchronized public void operateISubMethod(){
        try {
            while(i>0){
                i--;
                System.out.println("Sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
