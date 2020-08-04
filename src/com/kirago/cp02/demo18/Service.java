package com.kirago.cp02.demo18;


public class Service {
    private String lock = "123";

    /**
     * 因为这里引入了 sleep（5000）,lock对象已经发生了变化 那么对于锁对象就发生变化了，这个时候另外一个线程就能够获得到锁进行相应的操作了。
     */
    public void serviceMethod(){
        try {
            synchronized (lock){
                System.out.println("[BEGIN] Thread name : " + Thread.currentThread().getName() + " -> " + System.currentTimeMillis());
                lock = "456";
                // 如果注释这里的 sleep 那么就会造成死锁，因为锁对象一直会被最先抢占到的线程所持有
                Thread.sleep(5000);
                System.out.println("[END] Thread name : " + Thread.currentThread().getName() + " -> " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
