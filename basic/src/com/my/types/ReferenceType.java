package com.my.types;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/4 9:57
 */
public class ReferenceType {
    public static void main(String[] args) {
        String s = "Hello, Java";
        System.out.println(s);

        var car = new Car("byd", 9.8f);
        System.out.println(car);
    }
}
