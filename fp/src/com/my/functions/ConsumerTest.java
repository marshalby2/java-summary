package com.my.functions;

import java.util.List;
import java.util.function.Consumer;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/23 9:26
 */
public class ConsumerTest {
    public static void main(String[] args) {
        foreach(List.of(1, 2, 3, 4, 5), (i) -> System.out.println(i));
    }

    public static <T> void foreach(List<T> list, Consumer<T> consumer) {
        for (T i : list) {
            consumer.accept(i);
        }
    }
}
