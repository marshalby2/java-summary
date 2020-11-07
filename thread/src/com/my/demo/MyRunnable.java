package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 30/10/20 4:18 PM
 */
public class MyRunnable implements Runnable{

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ":" + i);
        }
    }
}
