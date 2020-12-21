package com.company.practice.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("demo.txt");
        pw.write(100); // it will add corresponding char to that value
        pw.print(100);//it will directly add value to the file
        pw.println(200);
        pw.print(true);
        pw.print("shubhra");
        pw.flush();
        pw.close();
    }
}
