package com.kirago.cp01.demo04;

/**
* @Description:    使用方法锁
* @Author:         kirago
* @CreateDate:     2020/8/2 10:05 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MyThreadWithSynchronized extends Thread{
    private int count =3;

    /**
     * 互斥区或者临界区
     */
    @Override
    synchronized public void run(){
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + " count " + count);
    }
}
