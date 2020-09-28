package com.kirago.aqs;

import org.junit.Test;


public class UnsharedLockTest {
    
    private static class MyRunnable implements Runnable{
        private UnsharedLock unsharedLock = new UnsharedLock();
        
        @Override
        public void run(){
            System.out.println(String.format("%s 运行", Thread.currentThread().getName()));
            unsharedLock.lock();
            System.out.println(String.format("%s 加锁",Thread.currentThread().getName()));
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            unsharedLock.unlock();
            System.out.println(String.format("%s 解锁", Thread.currentThread().getName()));
        }
    } 
    
    @Test
    public void run() throws InterruptedException{
        Runnable runnable = new MyRunnable();
        Thread threadA = new Thread(runnable,"线程A");
        Thread threadB = new Thread(runnable,"线程B");
        Thread threadC = new Thread(runnable,"线程C" );
        threadA.start();
        threadB.start();
        threadC.start();
        Thread.sleep(1000);
    }
    

}