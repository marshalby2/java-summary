package com.my.streams;

import java.text.CollationKey;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/5 21:32
 */
public class FlatMapTest {
    public static void main(String[] args) {
        var chinese = List.of("她", "他", "它");
        var english = List.of("she", "he", "it");
        var words = List.of(chinese, english);

        // 遍历中文和英文的字

        // 1. 传统方式
//        for (List<String> word : words) {
//            for (String s : word) {
//                System.out.println(s);
//            }
//        }

        // 2. 使用flatMap()，可以理解为将多个 stream 整合在一起，成为一个新的 stream
        words.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
