package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:43 AM
 *
 * 非主动引用
 * 通过数组定义来引用类，不会触发此类的初始化
 */
public class NotInitialization2 {
    public static void main(String[] args) {
        SuperClass[] arr = new SuperClass[20];
    }
}
