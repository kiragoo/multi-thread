package com.kirago.cp02.demo13;

public class Service {
    private String username;
    private String password;
    
    public void setUsernameAndPassword(String username, String password){
        try {
            String anything = new String();
            synchronized (anything){
                System.out.println("线程名称: " + Thread.currentThread().getName()
                        + " 在" + System.currentTimeMillis() + " 进入同步块"
                );
                this.username = username;
                Thread.sleep(2000);
                this.password = password;
                System.out.println(" 线程名称: " + Thread.currentThread().getName()
                        + " 在" + System.currentTimeMillis() + " 离开同步块"
                );
            } 
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
