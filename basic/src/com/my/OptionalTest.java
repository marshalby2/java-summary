package com.my;

import java.util.Optional;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/9/20 8:42 PM
 */
public class OptionalTest {
    public static void main(String[] args) {

        Integer i = null;
        var integer = Optional.ofNullable(10).orElse(100);
        System.out.println(integer);
    }
}
