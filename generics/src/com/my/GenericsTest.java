package com.my;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/9/20 9:09 AM
 */
public class GenericsTest {

    public static void main(String[] args) {
        List<Human> humanList= new ArrayList<>();
        List<Man> manList = new ArrayList<>();
        List<Women> womenList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        f(humanList);
//        f(manList); error

        f2(humanList);
        f2(manList);
        f2(womenList);

        f3(humanList);
        f3(objectList);


        f4(humanList);
        f4(womenList);
        f4(objectList);
    }


    public static void f(List<Human> list) {

    }

    public static void f2(List<? extends Human> list) {

    }

    public static void f3(List<? super Human> list) {

    }

    public static void f4(List<?> list) {

    }


}
