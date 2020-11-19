package com.my.test;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/11/20 7:30 PM
 */
public class DownloadTaskTest {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        var r1 = new DownloadTask("Effective Java");
        var t1 = new Thread(r1);
        t1.start();

        var r2 = new DownloadTask("Think in Java");
        var t2 = new Thread(r2);
        t2.start();

        // 等待线程结束
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        var end = System.currentTimeMillis();
        System.out.println("total time : " + (end - start)  + "ms");
    }
}
