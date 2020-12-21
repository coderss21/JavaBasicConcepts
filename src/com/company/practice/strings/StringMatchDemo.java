package com.company.practice.strings;

public class StringMatchDemo {
    public static void main(String[] args){
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if(s1==s2)
            System.out.println("Strings are equal");
        else
            System.out.println("Not equal");

        String s3="World";
        String s4= "World";
        if(s3==s4)
            System.out.println("2nd strings are equal");
        else
            System.out.println("2nd strings are equal");
    }
}
