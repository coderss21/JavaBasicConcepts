package com.company.practice.basicprograms;

/**
 * In This Class we understand how to implement method overriding
 * Method Overriding is when there is same method in child class as in parent class but with its
 * own implementation details.
 */
public class MethodOverriding {
    public static void main(String[] args){
        Boy obj = new Boy();
        obj.eat();
    }
}
 class Human{
    //Overridden method
    public void eat(){
        System.out.println("Human is eating");
    }
 }

 class Boy extends Human{
    //Overriding method
     public void eat(){
         System.out.println("Boy is eating");
     }
 }