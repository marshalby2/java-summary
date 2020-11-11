package com.my.inits;

/**
 * @Description TODO
 * @Author marshal
 * @Date 11/11/20 9:55 AM
 */
public class StaticInitBlock {

    static {
        System.out.println("This is static init block.");
    }

    {
        System.out.println("This is normal init block.");
    }

    public StaticInitBlock() {
        System.out.println("This is non-parameters constructor.");
    }

}
