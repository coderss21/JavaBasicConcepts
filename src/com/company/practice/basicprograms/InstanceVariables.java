package com.company.practice.basicprograms;

public class InstanceVariables {
    int x;
    boolean b;
    String s;
    double d;
    public static void main(String[] args){
        InstanceVariables test = new InstanceVariables();
        System.out.println(test.x+" value of integer");
        System.out.println(test.b+ " value of boolean ");
        System.out.println(test.s+" value of String variable");
        System.out.println(test.d+ " value of double ");
    }
}
