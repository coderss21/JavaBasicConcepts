package com.company.practice.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch ={'a','b','c'};
        bw.write(ch);
        bw.newLine();
        bw.write("Shubhra Singhal");
        bw.newLine();
        bw.write("Software Engineer");
        bw.flush();
        bw.close();
    }
}
