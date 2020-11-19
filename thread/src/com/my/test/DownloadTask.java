package com.my.test;

import java.util.Random;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/11/20 7:25 PM
 */
public class DownloadTask implements Runnable {

    private String filename;

    public DownloadTask(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        System.out.println("start download " + filename);
        var time = (int) (Math.random() * 1000);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(filename + " download complete. use time " + time + "ms");
    }
}
