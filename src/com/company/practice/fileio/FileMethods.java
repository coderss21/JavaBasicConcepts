package com.company.practice.fileio;

import java.io.File;

public class FileMethods {
    public static void main(String[] args){
        //to display file and directories in a defined path
//        File f = new File("E:\\game of thrones");
//        String[] s = f.list();
//        int count =0;
//        for(String s1:s){
//            count++;
//            System.out.println(s1);
//        }

        /* To display only file name in the desired path
        * */
        File f = new File("E:\\");
        String[] s = f.list();
        int count =0;
        for(String s1:s){
            File f1= new File(f,s1);
            if(f1.isFile()){
                count++;
                System.out.println(s1);
            }
        }
        System.out.println(count);
    }
}
