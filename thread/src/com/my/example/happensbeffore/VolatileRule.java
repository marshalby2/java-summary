package com.my.example.happensbeffore;

/**
 * @Description TODO
 * @Author marshal
 * @Date 7/11/20 9:01 AM
 * 对一个 volatile 变量的写操作， Happens-Before 于后续对这个 volatile 变量的读操作。
 */
public class VolatileRule {

    volatile int num = 10;

    private void write() {
        num = 100;
    }

    private int read() {
        return num;
    }

    public static void main(String[] args) {
        VolatileRule volatileRule = new VolatileRule();
        Thread th1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            volatileRule.write();
            System.out.println(Thread.currentThread().getName() + " end");
        });
        Thread th2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            System.out.println(volatileRule.read()); // 100
            System.out.println(Thread.currentThread().getName() + " end");
        });

        th1.start();
        th2.start();
    }

}
