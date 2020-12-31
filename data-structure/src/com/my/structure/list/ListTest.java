package com.my.structure.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/24 9:40
 */
public class ListTest {
    public static void main(String[] args) {
//        List<Integer> list = List.of(0, 1, 2, 3, 4);
//        List<Integer> collect = list.stream().map(i -> i * i).filter(i -> i > 5).collect(Collectors.toList());
//        collect.forEach(System.out::println);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> subList = list.subList(3, list.size());
        System.out.println(subList);

    }
}
