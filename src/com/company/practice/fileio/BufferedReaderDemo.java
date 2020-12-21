package com.company.practice.fileio;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //FileReader f = new FileReader("C:\\Users\\Shubhra\\Desktop\\Letter.pdf");
        FileReader f = new FileReader("sample.txt");
        BufferedReader br = new BufferedReader(f);
        String line = br.readLine();
        while (line!=null){
            System.out.println(line);
            line= br.readLine();
        }
        br.close();

    }
}
