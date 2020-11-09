package com.my.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 7/11/20 6:11 PM
 */
public class SafeList {

    public static void main(String[] args) {
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
    }
}
