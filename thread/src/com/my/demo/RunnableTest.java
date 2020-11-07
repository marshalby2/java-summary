package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 30/10/20 4:23 PM
 */
public class RunnableTest {
    public static void main(String[] args) {
        var runnableA = new MyRunnable("Thread-A");
        var runnableB = new MyRunnable("Thread-B");
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        threadA.start();
        threadB.start();
    }
}
