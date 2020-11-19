package com.my;

import java.util.List;
import java.util.function.Function;

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 7:05 PM
 */
public class FunctionalTest {
    public static void main(String[] args) {

        var list = List.of(1, 2, 3, 4, 5);
//        list.stream().map(e -> e * 2).forEach(System.out::println);

        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

    }

}
