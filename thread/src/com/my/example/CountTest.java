package com.my.example;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/11/20 9:47 AM
 */
public class CountTest {
    private long count = 0;

    // synchronized
    private synchronized void add10k() {
        System.out.println(Thread.currentThread().getName() + " start.");
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
        System.out.println(Thread.currentThread().getName() + " end.");
    }

    public static long calc() {
        CountTest test = new CountTest();
        Thread th1 = new Thread(test::add10k);
        Thread th2 = new Thread(test::add10k);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return test.count;
    }

    public static void main(String[] args) {
        System.out.println("The result is : " + CountTest.calc()); // 10000 ~ 20000
    }
}
