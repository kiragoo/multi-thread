package com.kirago.cp01.demo03;

/**
* @Description:    实例变量与线程安全
* @Author:         kirago
* @CreateDate:     2020/8/2 9:49 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MyThread extends Thread{
    
    private int count = 4;

    public MyThread(String name){
        super();
        this.setName(name);
    }
    
    @Override
    public void run() {
        super.run();
        while(count>0){
            System.out.println("Thread:" + Thread.currentThread().getName() + "->" + count--);
        }
    }
}
