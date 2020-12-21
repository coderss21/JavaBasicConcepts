package com.company.practice.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
       // FileReader fr = new FileReader("abc.txt");
/*------------------ Read data char by char-------------------
 --------------------------------------------*/
//        int i = fr.read();
//        while (i!=-1){
//            System.out.print((char)i);
//            i = fr.read();
//        }
//        fr.close();

        /* read data from file using int read(char[] ch) , use to copy all data into char
        array and then return the no of characters copied from file to array.
         */
        File f = new File("abc.txt");
        char[] ch = new char[(int) f.length()];
        FileReader fr = new FileReader(f);
        fr.read(ch);
        for(char ch1:ch){
            System.out.print(ch1);
        }
        fr.close();
    }
}
