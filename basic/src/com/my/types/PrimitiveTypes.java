package com.my.types;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/4 9:43
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        // 1. numeric type
        // 1.1 integer
        byte b = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        System.out.println(b == s);
        // 自动转换
        int b2i = b;
        // 强制转换
        byte i2b = (byte) i;

        char c = 'A';
        System.out.println(c); // A
        char c2 = 65;
        System.out.println(c2); // A

        // 1.2 float-point
        float f = 12.5f;
        System.out.println(f);
        double d = 29.52;
        System.out.println(d);


        // 2 boolean
        boolean bool = false;
        System.out.println(bool);


    }
}
