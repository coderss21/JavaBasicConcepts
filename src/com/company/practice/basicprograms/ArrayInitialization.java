package com.company.practice.basicprograms;

public class ArrayInitialization {
    public static void main(String[] args){
        int[][] x = new int[2][];
        System.out.println(x);
        System.out.println(x[0]);
        Number[] n = new Number[10];
        //gives null pointer exception
        //System.out.println(x[0][0]);
    }
}
