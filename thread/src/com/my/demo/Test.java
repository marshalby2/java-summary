package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 5/11/20 4:21 PM
 */
public class Test {
    public static void main(String[] args) {
        var th1 = new Thread(() -> {
            synchronized (Test.class) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        });
        var th2 = new Thread(() -> {
            synchronized (Test.class) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        });

        // start
        th1.start();
        th2.start();
    }
}
