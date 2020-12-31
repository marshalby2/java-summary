package com.my.functions;

import java.util.List;
import java.util.function.Supplier;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/23 9:39
 */
public class SupplierTest {
    public static void main(String[] args) {

    }

    public static <T> void s(List<T> list, Supplier<T> supplier) {
        supplier.get();
    }
}
