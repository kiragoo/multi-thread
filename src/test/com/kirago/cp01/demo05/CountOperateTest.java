package com.kirago.cp01.demo05;

import org.junit.Test;

public class CountOperateTest {

    @Test
    public void run() {
        Thread thread = new Thread(new CountOperate());
        thread.start();
    }
}