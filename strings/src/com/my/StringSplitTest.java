package com.my;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/22 10:00
 */
public class StringSplitTest {
    public static void main(String[] args) {
        String[] arr = {"01", "02", "03"};
        StringBuilder sb = new StringBuilder("");
        for (String s : arr) {
            sb.append(s + "|");
        }
        String sql = sb.toString();
        System.out.println(sql);
        System.out.println(sql.substring(0, sql.length() - 1));
    }
}
