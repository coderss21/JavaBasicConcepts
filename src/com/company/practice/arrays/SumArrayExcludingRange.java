package com.company.practice.arrays;

public class SumArrayExcludingRange {
    static void excludeRange(int[] list, int a, int b){
        int sum=0;
        boolean add= true;

        for(int i =0;i< list.length;i++){
            if(list[i] != a && add== true)
                sum=sum+list[a];
            //mark a when a and b is found
            else if(list[i]==a)
                add=false;
            else if(list[i]==b)
                add=true;
        }
        System.out.println("Sum of numbers excluding the range from" +a+" to "+b+ " is: "+sum);
    }

    public static void main(String[] args){
        int[] array = {1,2,6,7,8,9,10,11,15,20};
        excludeRange(array,6,9);
    }
}
