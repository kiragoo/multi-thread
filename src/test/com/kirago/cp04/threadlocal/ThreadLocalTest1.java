package com.kirago.cp04.threadlocal;

public class ThreadLocalTest1 {
    
    ThreadLocal<String> threadLocalS = new ThreadLocal<>();
    ThreadLocal<Long> threadLocalL = new ThreadLocal<>();
    
    public void set(){
        threadLocalL.set(Thread.currentThread().getId());
        threadLocalS.set(Thread.currentThread().getName());
    }
    
    public String getString(){
        return threadLocalS.get();
    }
    
    public Long getLong(){
        return threadLocalL.get();
    }
    
    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest1 test = new ThreadLocalTest1();
        
        test.set();
        
        System.out.println(Thread.currentThread().getName() + "->");
        System.out.println(test.getLong());
        System.out.println(test.getString());
        System.out.println(Thread.currentThread().getName() + "<-");
        
        Thread a = new Thread(() -> {
            test.set();
            System.out.println(Thread.currentThread().getName() + "->");
            System.out.println(test.getString());
            System.out.println(test.getLong());
            System.out.println(Thread.currentThread().getName() + "<-");
        });
        a.start();
        a.join();
        
        System.out.println(test.getLong());
        System.out.println(test.getString());

    }
}

