package com.kirago.cp01.demo04;

/**
* @Description:    共享变量，不使用同步锁
* @Author:         kirago
* @CreateDate:     2020/8/2 9:59 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MyThreadNotUseSynchronized extends Thread{
    
    private int count = 3;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + " count " + count);
    }
}
