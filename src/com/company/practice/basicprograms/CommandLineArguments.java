package com.company.practice.basicprograms;

public class CommandLineArguments {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int square = n*n;
        System.out.println("The square of "+n+ " is "+square);
    }
}
