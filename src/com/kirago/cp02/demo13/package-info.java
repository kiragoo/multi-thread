/**
 * 使用“synchronized（非this对象x）同步代码块”格式进行同步操作时，对象监视器必须是同一个对象。如果不是同一个对象监视器，运行的结果就是异步调用了，就会交叉运行。
 */
package com.kirago.cp02.demo13;