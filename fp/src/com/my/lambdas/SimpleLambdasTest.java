package com.my.lambdas;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/22 19:07
 */
public class SimpleLambdasTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        thread.start();
    }
}
