package com.my.example.happensbeffore;

/**
 * @Description TODO
 * @Author marshal
 * @Date 6/11/20 5:06 PM
 *  线程 join() 规则:
 *      这条是关于线程等待的。它是指主线程 A 等待子线程 B 完成（主线程 A 通过调用子线程 B 的 join() 方法实现），
 *      当子线程 B 完成后（主线程 A 中 join() 方法返回），主线程能够看到子线程的操作。
 */
public class JoinRule {
    private static int num = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            num = 100;
        });

        thread.start();
        thread.join();

        System.out.println(num); // 100
    }
}
