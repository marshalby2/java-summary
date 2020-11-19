package com.my.test;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/11/20 7:41 PM
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        var task1 = new DownloadTask("Effective Java");
        var task2 = new DownloadTask("Think in Java");
        var task3 = new DownloadTask("C Primer Plus");
        var task4 = new DownloadTask("Fluent Python");
        var task5 = new DownloadTask("Programming in Scala");
        List<DownloadTask> taskList = List.of(task1, task2, task3, task4, task5);

        //
        taskList.forEach(executorService::execute);

        executorService.shutdown();

        var end = System.currentTimeMillis();
        System.out.println("total time : " + (end - start)  + "ms");

    }
}
