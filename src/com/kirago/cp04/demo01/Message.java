package com.kirago.cp04.demo01;

public class Message {
    
    private int id;
    
    private String msg;
    
    public Message(int id, String msg){
        this.id = id;
        this.msg = msg;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setMsg(String msg){
        this.msg = msg;
    }
    
    public String getMsg(){
        return msg;
    }
}
