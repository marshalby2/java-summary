package com.my;

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/9/20 12:59 PM
 */
public class RegexTest {
    public static void main(String[] args) {
        String str = "123 222 333_";
        System.out.println(get(str));
    }

    /**
     *  正则替换
     *
     * @param str
     * @return
     */
    private static String get(String str) {
        // substitute blank
        var s1 = str.replaceAll("\\s", "|");
        // substitute *
        var s2 = s1.replaceAll("\\*", "%");
        if (!s2.contains("%") && !s2.contains("_")) {
            return "%(" + s2 + ")%";
        }
        return "(" + s2 + ")";
    }
}
