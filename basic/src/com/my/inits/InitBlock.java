package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:52 AM
 */
public class InitBlock {

    private int num = 20;

    {
        System.out.println("This is init block");
        num = 30;
    }


    public InitBlock() {
        System.out.println("This is non-parameters constructor.");
        System.out.println(num);
    }
    // 编译后，初始化块会被放到构造器里面，如下所示

//    public InitBlock() {
//        System.out.println("This is init block");
//        this.num = 30;
//        System.out.println("This is non-parameters constructor.");
//        System.out.println(this.num);
//    }
}
