package com.company.practice.basicprograms;

import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Square root of "+number+" is : "+Math.sqrt(number));
        System.out.println("Cube root of "+number+ " is: "+Math.cbrt(number));
    }
}
