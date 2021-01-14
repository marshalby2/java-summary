package com.my.structure.list;

import java.util.List;
import java.util.Vector;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/7 9:57
 */
public class VectorTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        var v = new Vector<Integer>(list);
        v.add(100);
        System.out.println(v.get(0));

    }
}
