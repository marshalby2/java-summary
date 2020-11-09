package com.my.example.locks;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description TODO
 * @Author marshal
 * @Date 7/11/20 10:25 AM
 * 可重入锁
 */
public class ReentrantLockExample {

    private final ReentrantLock lock = new ReentrantLock();
    int value;

    public void addOne() {
        lock.lock();
        try {
            for (int i = 0; i < 1000; i++) {
                value += 1;
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();
        Thread th1 = new Thread(example::addOne);
        Thread th2 = new Thread(example::addOne);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(example.value);  // 2000
    }

}
