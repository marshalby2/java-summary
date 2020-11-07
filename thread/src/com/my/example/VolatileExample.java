package com.my.example;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/11/20 10:12 AM
 */
public class VolatileExample {
    int x = 0;
    volatile boolean v = false;

    public void writer() {
        x = 42;
        v = true;
    }

    public void reader() {
        if (v) {
            // x ?
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        var example = new VolatileExample();
        example.writer();
        example.reader();
    }
}
