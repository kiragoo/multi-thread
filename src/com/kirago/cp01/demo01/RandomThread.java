package com.kirago.cp01.demo01;

/**
* @Description:    不保证线程的顺序性
* @Author:         kirago
* @CreateDate:     2020/8/1 10:48 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class RandomThread extends Thread{
    
    @Override
    public void run(){
        try {
            for(int i=0;i<100;i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run= " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
