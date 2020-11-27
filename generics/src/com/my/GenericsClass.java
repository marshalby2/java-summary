package com.my;

import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/11/20 8:43 AM
 */
public class GenericsClass<A> {

    A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public static void main(String[] args) {
        GenericsClass<Integer> intClass = new GenericsClass<>();
        intClass.setA(10);
        System.out.println(intClass.getA());

        GenericsClass<String> stringClass = new GenericsClass<>();
        stringClass.setA("hello");
        System.out.println(stringClass.getA());


        GenericsClass<List<Integer>> listGenericsClass = new GenericsClass<>();
        listGenericsClass.setA(List.of(10, 20 ,30));
        System.out.println(listGenericsClass.getA());

    }

}
