/**
 * synchronized 拥有锁重入的功能，即当一个线程得到一个对象锁后，再次请求此对象所是可以
 * 再次得到该对象锁的。及一个 synchronized方法/块的内部调用本类的其他 synchronized 方法/块
 * 时是永远可以得到锁的。
 */
package com.kirago.cp02.demo07;