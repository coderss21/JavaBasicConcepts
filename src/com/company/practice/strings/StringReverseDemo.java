package com.company.practice.strings;
/*
 ---------- Reverse a String using ByteArray-------------
 */
public class StringReverseDemo {
    public static void main(String[] args){
        String s = "PLM";
        //getBytes() method to convert string int bytes
        byte[] strAsByteArray = s.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        //Store result in reverse order into the result byte[]
        for(int i =0;i<strAsByteArray.length;i++)
            result[i]=strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }
}
