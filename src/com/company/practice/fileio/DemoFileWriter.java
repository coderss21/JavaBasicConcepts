package com.company.practice.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) throws IOException {
        //it will override the existing data
        //FileWriter fw = new FileWriter("abc.txt");
        //do append operation
        FileWriter fw = new FileWriter("abc.txt",true);
        fw.write(100);
        fw.write('\n');
        fw.write("Shubhra Singhal");
        fw.write('\n');
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}
