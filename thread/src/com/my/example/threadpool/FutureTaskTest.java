package com.my.example.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 9:02 PM
 */
public class FutureTaskTest {
    public static void main(String[] args) {
        // 创建FutureTask
        var task = new FutureTask<Integer>(() -> 1 + 2);

        // 创建线程池
        var executorService = Executors.newCachedThreadPool();

        // 提交任务
        executorService.submit(task);

        // 获取计算结果
        int result = 0;
        try {
            result = task.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
