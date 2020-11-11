package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:43 AM
 *
 * 非主动引用
 *通过子类来调用父类的静态字段，不会触发子类的初始化
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value); // 只会初始化父类
    }
}
