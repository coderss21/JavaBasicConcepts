package com.company.practice.basicprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AvoidingZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t > 1000){
            t=sc.nextInt();
        }
        for(int i =0;i<t;i++) {
            int lengthOfArray = sc.nextInt();
            Integer[] a = new Integer[lengthOfArray];
            for (int j = 0; j < lengthOfArray; j++) {
                a[j] = sc.nextInt();
            }
            int sum=0;
            for(int k=0;k<lengthOfArray;k++){
                sum=sum+a[k];
            }
            if(sum==0){
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                int[] b = new int[lengthOfArray];
               // Integer[] sorted = ArrayUtils.toObject(data);
                Arrays.sort(a, Collections.reverseOrder());
                for(int l=0;l<lengthOfArray;l++) {
                    b[l] = a[l];
                }
                for(int m=0;m<lengthOfArray;m++){
                    System.out.print(b[m]+" ");
                }
                System.out.println();
            }
        }
    }
}
