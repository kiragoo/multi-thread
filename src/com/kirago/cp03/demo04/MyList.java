package com.kirago.cp03.demo04;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList();
    
    public void add(){
        list.add("item");
    }
    
    public int size(){
        return list.size();
    }
}
