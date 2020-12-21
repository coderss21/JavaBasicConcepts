package com.company.practice.fileio;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("merge.txt");
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String line = br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("demo.txt"));
        line=br.readLine();
        while (line!=null){
            pw.println(line);
            line= br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();

    }
}
