package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 30/10/20 2:32 PM
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (MyThread.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName() + ":" + i);
            }
        }
    }
}
