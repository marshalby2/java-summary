package com.my.exceptions;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/11 9:27
 */
public class RunTimeExceptionTest {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        // ArrayIndexOutOfBoundsException
        System.out.println(nums[5]);

    }

}
