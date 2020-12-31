package com.my.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/22 19:32
 */
public class PredicateTest {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenList = filter(numbers, (i) -> i % 2 == 0);
        System.out.println(evenList);   // [0, 2, 4, 6, 8]

        List<String> plList = List.of("Java", "Scala", "Python", "C", "PHP", "Golang");
        List<String> jvmPl = filter(plList, (pl) -> pl.endsWith("a"));
        System.out.println(jvmPl);  // [Java, Scala]

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e: list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
