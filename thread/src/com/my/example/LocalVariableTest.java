package com.my.example;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/6 15:27
 */
public class LocalVariableTest {
    public static void main(String[] args) throws InterruptedException {
        int num = 0;

        var obj = new LocalVariableTest();
        Thread t1 = new Thread( () -> obj.add10k(num));
        Thread t2 = new Thread( () -> obj.add10k(num));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("num = " + num);

    }

    private int add10k(int num) {
        System.out.println(Thread.currentThread().getName() + " start.");
        int idx = 0;
        while (idx++ < 10000) {
            num += 1;
        }
        System.out.println(Thread.currentThread().getName() + " end.");
        return num;
    }
}
