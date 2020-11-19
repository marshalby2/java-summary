package com.my.classes;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:06 AM
 */
public class RecordTest {
    public static void main(String[] args) {
        User user = new User("Tom", 20);
        System.out.println(user);
        System.out.println(user.name());
    }
}
