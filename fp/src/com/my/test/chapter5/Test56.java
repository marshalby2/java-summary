package com.my.test.chapter5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/23 17:39
 */
public class Test56 {
    public static void main(String[] args) {
        var raoul = new Trader("Raoul", "Cambridge");
        var mario = new Trader("Mario", "Milan");
        var alan = new Trader("Alan", "Cambridge");
        var brian = new Trader("Brian", "Cambridge");
        List<Transaction> list = List.of(new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        System.out.println(f1(list));
    }

    // (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
    public static List<Transaction> f1(List<Transaction> list) {
        return list.stream()
                .filter(e -> e.year() == 2011)
                .sorted(Comparator.comparing(Transaction::value))
                .collect(Collectors.toList());
    }
}
