package com.kirago.cp01.demo05;

/**
* @Description:    构造器的方法是被main线程调用的，而 run 方法是被 CountOperate 线程调用的
* @Author:         kirago
* @CreateDate:     2020/8/2 10:18 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CountOperate extends Thread{
    
    public CountOperate(){
        System.out.println("CountOperate-- begin");
        System.out.println("Thread get name " + Thread.currentThread().getName());
        System.out.println("This get name " + this.getName());
        System.out.println("CountOperate-- end");
    }
    
    @Override
    public void run(){
        System.out.println("run-- begin");
        System.out.println("Thread get name " + Thread.currentThread().getName());
        System.out.println("This get name " + this.getName());
        System.out.println("run-- end");
    }
}
