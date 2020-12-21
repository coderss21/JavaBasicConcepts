package com.company.practice.jvm;

import java.lang.reflect.Method;
class Student {
    public String getName(){
        return  null;
    }
    public int getRollNo(){
        return 10;
    }

}
//A class to count no of method inside student class
class Test{
    public static void main(String[] args) throws ClassNotFoundException {
        Student s1= new Student();
        Class c1 = s1.getClass();
        Student s2= new Student();
        Class c2 = s2.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);
//        int count=0;
//        Method[] m = c.getDeclaredMethods();
//        for(Method m1:m){
//            count++;
//            System.out.println(m1.getName());
//        }
//        System.out.println("The number of methods: "+count);
    }
}

