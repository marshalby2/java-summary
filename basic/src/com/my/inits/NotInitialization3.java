package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:43 AM
 *
 * 非主动引用
 * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
 */
public class NotInitialization3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLO_WORLD);
    }
}
