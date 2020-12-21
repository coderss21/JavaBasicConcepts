package com.company.practice.jvm;

public class HeapDemo {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        System.out.println("Output in bytes");
        System.out.println("Max Memory : "+r.maxMemory());
        System.out.println("Initial Memory: "+r.totalMemory());
        System.out.println("Free Memory: "+r.freeMemory());
        System.out.println("Consumed Memory: "+(r.totalMemory()-r.freeMemory()));
    //Getting result in MB
        System.out.println("Output in MB");
        double mb = 1024*1024;
        System.out.println("Max Memory : "+r.maxMemory()/mb);
        System.out.println("Initial Memory: "+r.totalMemory()/mb);
        System.out.println("Free Memory: "+r.freeMemory()/mb);
        System.out.println("Consumed Memory: "+(r.totalMemory()-r.freeMemory())/mb);
    }
}
