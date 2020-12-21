package com.company.practice.java8newfeature;
interface Sayable{
    //Single parameter method
     String say(String name);
     //int add(int a, int b);
        }

public class LambdaSingleParameterDemo {
    public static void main(String[] args) {

        //Lambda expression with single parameter
        Sayable s1 = (name) -> "Hello " + name;

        System.out.println(s1.say("Shubhra"));
        //Omit paranthesis from function
        Sayable s2 = name -> "Hello " + name;

        System.out.println(s2.say("Nishu"));
}

}
