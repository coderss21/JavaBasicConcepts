package com.company.practice.basicprograms;

import java.util.Scanner;

public class NumberOfApartments {
    public static void main(String[] args){
        int testCases;
        //int numberOfWindows;
        //int[] numberOfApartments = new int[3];
        Scanner sc = new Scanner(System.in);
        testCases= sc.nextInt();
        for(int i =0;i<testCases;i++){
            System.out.println("No of windows");
            int numberOfWindows=sc.nextInt();

//           int noOf3 = numberOfWindows-3;
//           int noOf5 =  numberOfWindows-5;
//           int noOf7= numberOfWindows-7;

           for(int j =0;j<numberOfWindows;j++){
               aa:
               for(int k=0;k<numberOfWindows;k++){
                   for(int l=0;l<numberOfWindows;l++) {
                       int sum = (j * 3) + (k * 5) + (l * 7);
                       if (sum == numberOfWindows) {
                           System.out.println(j + " " + k + " " + l);
                       }
                       break aa;
                   }
               }
           }
        }
    }
}
