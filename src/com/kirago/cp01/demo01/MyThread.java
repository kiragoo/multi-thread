package com.kirago.cp01.demo01;

/**
* @Description:    继承 Thread 类
* @Author:         kirago
* @CreateDate:     2020/8/1 10:35 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("继承与Thread");
    }
}
