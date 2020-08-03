package com.kirago.cp02.demo15;

public class MyService {
//    public MyOneList addServiceMethod(MyOneList myOneList, String data){
//        try {
//            if (myOneList.getSize()<1){
//                Thread.sleep(2000);
//                myOneList.add(data);
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        return myOneList;
//    }
    public MyOneList addServiceMethod(MyOneList myOneList, String data) {
        synchronized (myOneList) {
            try {
                if (myOneList.getSize() < 1) {
                    Thread.sleep(2000);
                    myOneList.add(data);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return myOneList;
        }
    }
}
