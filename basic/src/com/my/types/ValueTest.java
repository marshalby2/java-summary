package com.my.types;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2021/1/6 15:31
 */
public class ValueTest {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("(1) num = " + num); // 0
        new ValueTest().increase(num);
        System.out.println("(2) num = " + num); // 0
    }

    private void increase(int num) {
        int i = 0;
        while (i < 100) {
            num += i;
            i++;
        }
        System.out.println("(3) num = " + num); // 4950
    }
}
