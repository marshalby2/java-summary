package com.my.structure.map;

import java.util.Map;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/24 9:36
 */
public class MapTest {
    public static void main(String[] args) {
        var map = Map.of("Tom", 20, "Jack", 22);
        System.out.println(map);    // {Tom=20, Jack=22}
        System.out.println(map.get("Tom"));
        map.forEach((name, age) -> System.out.println(name + " is " + age + " years old."));
    }
}
