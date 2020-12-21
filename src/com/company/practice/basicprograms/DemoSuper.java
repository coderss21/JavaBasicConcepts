package com.company.practice.basicprograms;

/**
 * The super keyword is used for calling the parent class method/constructor. super.myMethod()
 * calls the myMethod() method of base class while super() calls the constructor of base class.
 */
public class DemoSuper {
    public static void main(String[] args){
        Demo obj = new Demo();
        obj.myMethod();
    }

}
class ABC{
    public void myMethod(){
        System.out.println("Overriden Method");
    }
}

class Demo extends ABC{
    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding Method");
    }
}