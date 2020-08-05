package com.kirago.cp03.demo01;

import java.util.ArrayList;
import java.util.List;

public class Service {
    
    private List<Integer> list = new ArrayList<>();
    
    public void add(){
        list.add(1);
    }
    
    public int getSize(){
        return list.size();
    }
}
