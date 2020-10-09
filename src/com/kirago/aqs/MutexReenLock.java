package com.kirago.aqs;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/**
* @description:    互斥可重入锁
* @author:         kirago
* @date:     2020/10/9 11:48 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class MutexReenLock {
    private AtomicReference<Thread> owner = new AtomicReference<>();
    private LinkedList<Thread> waitQueue = new LinkedList<>();
    private AtomicInteger state = new AtomicInteger();
    
    public void lock(){
        Thread currentThread = Thread.currentThread();
        if(owner.get() == currentThread){
            state.incrementAndGet();
            return;
        }
        
        if(!owner.compareAndSet(null, currentThread)){
            waitQueue.add(currentThread);
            LockSupport.park();
        }
    }
    
    public void unLock(){
        if(Thread.currentThread() != owner.get()){
            throw new RuntimeException();
        }
        
        if(state.get() > 0) {
            state.decrementAndGet();
            return;
        }
        if(waitQueue.size()>0){
            Thread t = waitQueue.poll();
            owner.set(t);
            LockSupport.unpark(t);
        }else {
            owner.set(null);
        }
    }
}
