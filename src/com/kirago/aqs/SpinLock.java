package com.kirago.aqs;

import java.util.concurrent.atomic.AtomicReference;

/**
* @description:    自旋锁
* @author:         kirago
* @date:     2020/10/9 11:36 上午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class SpinLock {
    private AtomicReference<Thread> owner = new AtomicReference<>();
    
    public void lock(){
        Thread current = Thread.currentThread();
        while (!owner.compareAndSet(null, current)){
            
        }
    }
    
    public void unLock(){
        Thread current = Thread.currentThread();
        owner.compareAndSet(current, null);
    }
}
