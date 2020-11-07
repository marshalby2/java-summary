package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 30/10/20 2:31 PM
 */
public class ThreadTest {
    public static void main(String[] args) {
        var threadA = new MyThread("MyThread-A");
        var threadB = new MyThread("MyThread-B");
        threadA.start();
        threadB.start();

//        System.out.println(threadA.getName()); // Thread-0
    }
}
