package com.company.practice.strings;

/**
 * Reverse the String Using StringBuilder class
 */
public class ReverseStringDemo2 {
    public static void main(String[] args){
        String s = "Shubhra";
        StringBuilder s1 = new StringBuilder();

        s1.append(s);
        s1=s1.reverse();
        System.out.println(s1);

        System.out.println("Reverse String Using String to Character Array");
        stringToCharacterArray();
        System.out.println("Reverse String using String buffer");
        stringBuffer();
    }

    /*
     Converting String Using String to Character Array
     */
    static void stringToCharacterArray(){
        String input = "Hello world";
        char[] array = input.toCharArray();

        for(int i=array.length-1;i>=0;i--)
            System.out.print(array[i]);
        System.out.println(" ");

    }

    /*
    Reverse the string using StringBuffer
     */

    static void stringBuffer(){
        String input= " Genius Curious";
        StringBuffer sbr = new StringBuffer(input);
        sbr.reverse();
        System.out.println(sbr);
    }
}
