package com.kirago.cp02.demo06;

public class PublicVar {
    public String username = "A";
    public String password = "B";

    /**
     * 其实这边获得的是对象锁，只有等线程执行完setValue之后才能到下个线程执行这个方法
     * @param username
     * @param password
     */
    synchronized public void setValue(String username, String password){
        
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username= " +
                    username + " password= " + password );
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * 这边由于并未加锁，所以是异步执行
     */
    public void getValue(){
        System.out.println("getValue method thread name= " + Thread.currentThread().getName() +
                " username= " + username + " password= " + password );
    }
}
