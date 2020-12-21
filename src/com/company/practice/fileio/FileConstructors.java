package com.company.practice.fileio;

import java.io.File;
import java.io.IOException;

public class FileConstructors {
    public static void main(String[] args) throws IOException {
        /** craete a directory named with sample and create a file name with xyz.txt
         * in that directory
         */
        File f1 = new File("sample");
        f1.mkdir();
        File f2 = new File(f1,"xyz.txt");
        System.out.println(f2.exists());
        f2.createNewFile();

        /** create a file in E:\myfiles folder */

        File f3 = new File("E:\\myfiles","sample.txt");
        f3.createNewFile();
    }
}
