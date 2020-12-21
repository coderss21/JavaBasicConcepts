package com.company.practice.operators_assignments;

public class IncreementDecreementDemo {
    public static void main(String[] args){
        int x = 10;
        int y= ++x;
        System.out.println(y);  //O/P - 11
       // int y = ++10; //CE: java unexpected type required:variable, found:value
        //System.out.println(y);

        char ch='a';
        ch++;
        System.out.println(ch);

        double d = 10.5;
        d++;
        System.out.println(d);

        byte a =10;
        byte b = 20;
//        byte c = a+b;  //CE: saying incompatible types: possible lossy conversion from int to byte
        //To get output of any arithmetic operation less than int type of size we need to perform type casting
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}
