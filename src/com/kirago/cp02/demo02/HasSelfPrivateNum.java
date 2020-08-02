package com.kirago.cp02.demo02;

/**
* @Description:    实例变量非线程安全
* @Author:         kirago
* @CreateDate:     2020/8/2 10:26 下午
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class HasSelfPrivateNum {

    int num = 0;
    
    public void add(String name){
        try {
            if(name.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(10000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(name + " num= " + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
