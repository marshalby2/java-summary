package com.my.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/23 9:31
 */
public class FunctionTest {
    public static void main(String[] args) {
        List<String> strs = List.of("Java", "Python", "Scala", "Golang");
        System.out.println(map(strs, (s) -> s.length()));   // [4, 6, 5, 6]
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T i : list) {
            R r = function.apply(i);
            result.add(r);
        }
        return result;
    }
}
