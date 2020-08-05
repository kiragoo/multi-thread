package com.kirago.cp03.demo02;

public class Service {
    
    public static void main(String[] args){
        try {
            String string = new String("");
            string.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
