package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:46 AM
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLO_WORLD = "Hello world";
}
