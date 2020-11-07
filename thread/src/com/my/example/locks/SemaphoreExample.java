package com.my.example.locks;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description TODO
 * @Author marshal
 * @Date 7/11/20 10:25 AM
 */
public class SemaphoreExample {

    private static final Semaphore semaphore = new Semaphore(1);
    static int value;

    public static void addOne() {
        try {
            semaphore.acquire();

            for (int i = 0; i < 1000; i++) {
                value += 1;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(SemaphoreExample::addOne);
        Thread th2 = new Thread(SemaphoreExample::addOne);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(SemaphoreExample.value);  // 2000
    }

}
