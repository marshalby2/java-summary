package com.my;

/**
 * @Description TODO
 * @Author marshal
 * @Date 31/10/20 5:15 PM
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "def";
        String s4 = "abcdef";

        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("(s1 + s2) == s4 ? " + ((s1 + s2) == s4));
        System.out.println("s1 == s5 ? " + (s1 == s5));
        System.out.println("s5 == s6 ? " + (s5 == s6));
    }
}
