package com.my.grammer;

/**
 * @Description TODO
 * @Author marshal*
 * @Date 28/9/20 9:02 PM
 */
public class SwitchTest {
    public static void main(String[] args) {
        final var num = 5; // constant
        int i = (int) (Math.random() * 10);
        var result = switch (i)  {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case num -> "five";  // num must final,
            default -> "many";
        };
        System.out.println(result);
    }
}
