package com.company.practice.jvm;

import java.lang.reflect.Method;

public class TestString {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Method[] m = c.getDeclaredMethods();
        int count=0;
        for(Method m1:m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("Total no of methods: "+count);
    }
}
