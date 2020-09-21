package com.kirago.cp03.demo02;


import org.junit.Test;

public class MessageQueueTest {
    
    @Test
    public void testMessageQueue() throws InterruptedException {
        MessageQueue messageQueue = new MessageQueue(2);
        
        for(int i=0;i<100;i++){
            int id = i;
            new Thread(()->{
                messageQueue.create(new Message(id, "值: " + String.valueOf(id)));
            },"生产者").start();
        }
        
        
        new Thread(()->{
            while (true){
                messageQueue.consume();
            }
        },"消费者").start();
        
        Thread.sleep(300);
    }

}