package com.kirago.aqs;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/**
* @description:    互斥锁
* @author:         kirago
* @date:     2020/10/9 11:14 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class MutexLock {
    
    private AtomicReference<Thread> owner = new AtomicReference<>();
    
    private LinkedList<Thread> waiterQueue = new LinkedList<>();
    
    public void lock(){
        Thread currentThread = Thread.currentThread();
        if(!owner.compareAndSet(null,currentThread)){
            waiterQueue.add(currentThread);
            LockSupport.park();
        }
    }
    
    public void unLock(){
        if(Thread.currentThread() != owner.get()){
            throw new RuntimeException();
        }
        if(waiterQueue.size()>0){
            Thread t = waiterQueue.poll();
            owner.set(t);
            LockSupport.unpark(t);
        }else {
            owner.set(null);
        }
    }
}
