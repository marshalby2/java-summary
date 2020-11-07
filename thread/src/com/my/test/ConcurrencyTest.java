package com.my.test;

/**
 * @Description TODO
 * @Author marshal
 * @Date 30/10/20 3:57 PM
 */
public class ConcurrencyTest {
    private static final long count = 10000L;

    public static void main(String[] args) {
        concurrency();
        serial();
    }

    private static void concurrency() {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (int i = 0; i < count; i++) {
                a += 5;
            }
        });
        thread.start();

        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("currency : " + time + "ms, b = " + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("currency : " + time + "ms, a = " + a + " b = " + b);
    }
}
