package com.my.example.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/15 21:03
 */
public class ListTest {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "Scala", "C"};
        List<String> list = Arrays.asList(strings);
        List<String> synchronizedList = Collections.synchronizedList(list);
    }
}
