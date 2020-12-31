package com.my.interfaces;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/28 8:50
 */
public interface A {
    void f1();

    default void f2() {
        System.out.println("this is f2.");
    }

    static void f3(String s) {
        System.out.println("this is f3 with argument s = " + s);
    }
}
