package com.my;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/22 14:35
 */
public class StringsToIntTest {
    public static void main(String[] args) {
        String s = "54.56";
        float a = Float.parseFloat(s);
        System.out.println(a);
        System.out.println(a / 100);
    }
}
