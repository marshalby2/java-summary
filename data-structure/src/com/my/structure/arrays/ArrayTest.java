package com.my.structure.arrays;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/16 9:32
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 1. 声明并赋值
        int n1[] = {1, 2, 3};
        int n3[] = new int[]{1, 2, 3};
        // 2. 只是声明，不赋值
        int n2[] = new int[10];
        System.out.println(n2); // [I@16b98e56
        System.out.println(n2.getClass()); // class [I

        String str[] = {"Java", "Scala"};
        System.out.println(str); // [Ljava.lang.String;@7ef20235
        System.out.println(str.getClass()); // class [Ljava.lang.String;

        // 遍历数组元素
//        for (int i = 0; i < n2.length; i ++) {
//            System.out.println(n2[i]);
//        }

    }
}
