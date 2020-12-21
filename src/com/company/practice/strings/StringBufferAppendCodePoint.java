package com.company.practice.strings;
import java.lang.*;
/**
 * This class is to show the demonstration of using appendCodePoint of StringBuffer
 * appendCodePoint will add the ASCII value of the number to the StringBuffer
 */
public class StringBufferAppendCodePoint {
    public static void main(String[] args){
        StringBuffer sbf  = new StringBuffer("Hello World");
        System.out.println("String buffer= " +sbf);

        //appends the CodePoint as String to StringBuffer
        sbf.appendCodePoint(156);
        System.out.println("After appending the code point: "+sbf);
    }
}
