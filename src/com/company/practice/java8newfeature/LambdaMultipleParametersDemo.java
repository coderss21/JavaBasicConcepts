package com.company.practice.java8newfeature;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

interface Addable{
    int add(int a,int b);
}
public class LambdaMultipleParametersDemo {
    public static void main(String[] args){
        //Multiple parameters in lambda expression
        Addable ad1 = (a,b)->(a+b);
        System.out.println("Addition without passing data type");
        System.out.println(ad1.add(10,20));

        //Multiple Parameters with data type in lambda expression
        Addable ad2 = (int a,int b)->(a+b);
        System.out.println("Addition with passing data type of parameters");
        System.out.println(ad2.add(30,20));
    }
}
