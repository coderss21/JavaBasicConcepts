package com.company.practice.arrays;
class Student{
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
}

public class ArrayOfObjectsDemo {
    public static void main(String[] args){
        Student[] arr= new Student[5];
        arr[0]= new Student(1, "Shubhra");
        arr[1]=new Student(2,"Harish");
        arr[2]=new Student(3,"Adamya");
        arr[3]=new Student(4,"Mansi");
        arr[4]=new Student(5,"Rishika");

        for(int i=0;i<arr.length;i++){
            System.out.println("Data at index "+i+" is: "+arr[i].rollNo +" " +arr[i].name);
        }
    }
}
