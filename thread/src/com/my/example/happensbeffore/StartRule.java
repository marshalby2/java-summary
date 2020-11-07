package com.my.example.happensbeffore;

/**
 * @Description TODO
 * @Author marshal
 * @Date 6/11/20 4:58 PM
 *
 * happens-before 规则之 线程的start()规则，即主线程（main）启动子线程 thread 后，子线程 thread 能够看到主线程在启动子线程 thread 前的操作。
 */
public class StartRule {

    private static int num = 10;

    static final int n = 100;

    public static void main(String[] args) {
        System.out.println("before thread : num = " + num); // 10
        Thread thread = new Thread(() -> {
            System.out.println("thread : num = " + num); // 20
        });
        num = 20; // 线程thread对num的修改对自现场thread是可见的
        thread.start();
    }
}
