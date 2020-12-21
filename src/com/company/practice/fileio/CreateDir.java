package com.company.practice.fileio;

import java.io.File;

public class CreateDir {
    public static void main(String[] args){
        File f1 = new File("shubhra");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());
    }
}
