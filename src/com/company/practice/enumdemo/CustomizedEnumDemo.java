package com.company.practice.enumdemo;

enum TrafficSignal{
    //This will call enum constructor with one argument
    RED("STOP"), GREEN("GO"),ORANGE("SLOW DOWN");

    private String action;

    //getter method
    public String getAction(){
        return this.action;
    }
    //enum constructor can't be public or protected
    private TrafficSignal(String action)
    {
        this.action=action;
    }
}

//Driver Code
public class CustomizedEnumDemo {
    public static void main(String[] args){
        TrafficSignal[] signals = TrafficSignal.values();

        for(TrafficSignal signal: signals){
            System.out.println("name: "+signal.name()+
                    " action: " +signal.getAction());
        }
    }
}
