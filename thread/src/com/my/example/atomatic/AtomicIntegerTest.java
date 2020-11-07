package com.my.example.atomatic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description TODO
 * @Author marshal
 * @Date 4/11/20 5:22 PM
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(10);
        int i = integer.getAndIncrement();
        System.out.println(i);
    }
}
