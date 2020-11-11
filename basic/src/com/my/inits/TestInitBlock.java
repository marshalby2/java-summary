package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:54 AM
 */
public class TestInitBlock {
    public static void main(String[] args) {
//        new InitBlock();  // 先执行普通的初始化块，再执行构造器
//        new StaticInitBlock(); // 先执行静态初始化块，再执行普通的初始化块，最后执行构造器
        new SubClass(); // 会先执行父类的静态初始化块，再执行子类的静态初始化块
    }
}
