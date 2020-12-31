package com.my.streams;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/24 9:12
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream range = IntStream.range(0, 10);
        range.filter(i -> i % 2 == 0).forEach(System.out::println);
//        range.collect()
    }
}
