package com.my.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/21 15:43
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 9, 2, 3, 7, 5, 6, 4, 8, 0);
        List<Integer> collect = list.stream()
                .map(i -> i * i)
                .filter(i -> i > 10)
//                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
