package com.company.practice;

public class Multiply2Strings {
    public static String multiply(String num1, String num2) {
        long len1 = num1.length();
        long len2 = num2.length();
        // if(len1 >= 110  || len2 >=110)
        //     return null;

        if(len1 == 0 || len2 == 0) return "";

        long n1 = stringToInt(num1);
        long n2 = stringToInt(num2);
        long multiply = n1 * n2;
        System.out.println(multiply);
        //Code for converting int to String
        if(multiply == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        while(multiply > 0){
            long curr = multiply %10;
            multiply = multiply/10;
            sb.append(curr);
        }

        String s = sb.substring(0);
        sb = new StringBuilder();
        for(int i=s.length()-1; i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.substring(0);
    }

    private static long stringToInt(String str){
        int i =0;
        long num=0;
        long len = str.length();
        while(i<len){
            num *= 10;
            num += (str.charAt(i++)-'0');
        }

        return num;
    }

    public static void main(String[] args){
        String num1 = "498828660196";
        String num2 = "840477629533";
        String result = multiply(num1,num2);
        System.out.println(result);
    }
}
