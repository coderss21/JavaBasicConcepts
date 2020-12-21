package com.company.practice.java8newfeature;
interface Drawable{
    public void draw();
}
public class LambdaExpressionDemo {
    public static void main(String[] args){
        int width=10;

        Drawable d=() ->{
            System.out.println("Drawing "+width);
        };
        d.draw();
    }
}
