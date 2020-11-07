package com.my.grammer;

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/10/20 9:12 AM
 */
public class WhileTest {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println("#: " + i);
            if (i == 5) {
                break;
            }
            System.out.println("$: " + i);
            i++;
        }

    }
}
