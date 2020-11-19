package com.my.example.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/11/20 10:59 AM
 */
public class ExecutorsExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            WorkThread thread = new WorkThread("" + i);
            executorService.execute(thread);
        }

        // 等待线程池里面的所有线程结束
        new ExecutorsExample().awaitAfterShutdown(executorService);

        System.out.println("Finished all threads");
    }

    public void awaitAfterShutdown(ExecutorService threadPool) {

        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                threadPool.shutdownNow();
            }
        } catch (InterruptedException ex) {
            threadPool.shutdownNow();
            Thread.currentThread().interrupt();
        }

    }
}
