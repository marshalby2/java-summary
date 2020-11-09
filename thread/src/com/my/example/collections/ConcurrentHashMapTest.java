package com.my.example.collections;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/11/20 2:12 PM
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        var map = new ConcurrentHashMap<Integer, String>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Peach");
        map.put(4, "Banana");
        System.out.println(map);
    }
}
