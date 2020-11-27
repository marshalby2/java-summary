package com.my.test;

/**
 * @Description TODO
 * @Author marshal
 * @Date 23/11/20 9:47 AM
 */
public class LocalVariableTest {

    private static void count() {
        int i = 0;

        new Thread( () -> {
            System.out.println(i);
        });

    }

}
