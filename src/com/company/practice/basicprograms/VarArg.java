package com.company.practice.basicprograms;

public class VarArg {
    public void m1(int... x){
        System.out.println("Var arg method");
    }
    public void m1(int x){
        System.out.println("General method");
    }
    public static void main(String[] args){
        VarArg o= new VarArg();
        o.m1();
        o.m1(10);
        o.m1(10,20,30);
    }
}
