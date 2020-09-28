package com.kirago.aqs;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 自定义 AQS 独占锁模式下的同步器来实现独享锁
 */
public class UnsharedLock implements Lock, Serializable {

    /**
     * 自定义AQS独占模式下的同步器
     * 使用 state 为 0 表示当前锁没有被线程持有
     * 使用 state 为 1 标识当前线程已经被线程持有
     */
    private static class Sync extends AbstractQueuedSynchronizer{
        
        /**
        * @Description: 判断锁是否被当前线程持有
        * @Param: 
        * @return: 
        **/
        protected boolean isHeldExclusively(){
            return getExclusiveOwnerThread() == Thread.currentThread();
        }
        
        /**
        * @Description: 尝试去获取锁
        * @Param: acquires
        * @return: boolean
        **/
        protected boolean tryAcquire(int acquires){
            assert acquires == 1;
            if(compareAndSetState(0, 1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }
        
        /**
        * @Description: 尝试释放锁（需求被谁加的锁被谁释放）
        * 判断当前拥有同步资源的线程是否为当前线程，如果不是则抛出异常，否则释放锁
        * 为三种调用情况，锁空闲的状态下调用、锁已经被持有但不是拥有锁的线程，锁已经被线程持有且为拥有锁的线程
        * @Param: release
        * @return: bolean
        **/
        protected boolean tryRelease(int release){
            assert release == 1;
            if(Thread.currentThread() != getExclusiveOwnerThread()){
                throw new IllegalMonitorStateException();
            }
            if(getState() == 0) throw new IllegalMonitorStateException();
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
        
        /**
        * @Description: 提供一个Condition实例
        * @Param: 
        * @return: 
        **/
        Condition newCondition(){
            return new ConditionObject();
        }
        
        /**
        * @Description: 判断锁是否被线程持有
        * @Param: 
        * @return: 
        **/
        private boolean isLocked(){
            return getState() == 1;
        }
    }

    /**
     * 同步器
     */
    private final Sync sync = new Sync();

    /**
     * 加锁
     */
    public void lock(){
        sync.acquire(1);
    }

    /**
     * 尝试获取锁
     * @return
     */
    public boolean tryLock(){
        return sync.tryAcquire(1);
    }

    /**
     * 解锁，只能调用同步器的#release()，不能调用 tryRelease()方法，因为tryRelease 方法只是简单的修改了同步状态
     * 并没有唤醒等待队列中的线程，正常是需要唤醒等待队列中离头结点最近的同时等待状态不为CANCELLED的节点
     */
    public void unlock(){
        sync.release(1);
    }

    /**
     * 返回与此UnsharedLock绑定的Condition实例
     */
    public Condition newCondition(){
        return sync.newCondition();
    }

    /**
     * 判断锁是否被线程持有
     */
    public boolean isLocked(){
        return sync.isLocked();
    }

    /**
     * 判断是否有线程在等待获锁
     */
    public boolean hasQueuedThreads() {
        return sync.hasQueuedThreads();
    }

    /**
     * 可能抛出 InterruptedException 的加锁
     */
    public void lockInterruptibly() throws InterruptedException{
        sync.acquireInterruptibly(1);
    }

    /**
     * 在指定的时间内尝试获取锁
     */
    public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1, unit.toNanos(timeout));
    }
}
