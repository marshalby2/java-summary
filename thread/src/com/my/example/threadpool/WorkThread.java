package com.my.example.threadpool;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/11/20 10:23 PM
 */
public class WorkThread implements Runnable{

    private String command;

    public WorkThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start. command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " end");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
