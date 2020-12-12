package com.my.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2020/12/11 9:30
 */
public class NonRuntimeExceptionsTest {

    public static void main(String[] args) {
        var path = "D:/test/NonRuntimeExceptionsTest.txt";
        File file = new File(path);
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(path);
//            outputStream.write("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
