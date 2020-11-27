package com.my;

import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/11/20 8:42 AM
 */
public class GenericsFunction {

    public static <A> void printList(List<A> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        printList(list);

        List<String> strings = List.of("a", "b", "c");
        printList(strings);
    }
}
