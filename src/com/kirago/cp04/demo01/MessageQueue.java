package com.kirago.cp04.demo01;

import java.util.LinkedList;
import java.util.logging.Logger;

public class MessageQueue {
    
    private static final Logger logger = Logger.getLogger(MessageQueue.class.getName());
    
    private final LinkedList<Message> linkedList = new LinkedList<>();
    
    private int capacity;
    
    public MessageQueue(int capacity){
        this.capacity = capacity;
    }
    
    public void create(Message message){
        synchronized (linkedList){
            while (linkedList.size() == capacity){
                logger.info("队列已满，等待消费者去消费");
                try {
                    linkedList.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            linkedList.addLast(message);
            logger.info("生产消息: " + message.getMsg());
            linkedList.notifyAll();
        }
    }
    
    public Message consume(){
        synchronized (linkedList){
            while (linkedList.isEmpty()){
                logger.info("队列为空，需要生产消息");
                try {
                    linkedList.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            Message message = linkedList.removeFirst();
            logger.info("消费消息: " + message.getMsg());
            linkedList.notifyAll();
            return message;
        }
    }
    
}
