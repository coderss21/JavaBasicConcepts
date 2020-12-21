package com.company.practice.basicprograms;
class BasePage{
    public BasePage(){
        System.out.println("base Page created");
    }
}
class LoginPage extends BasePage{
    public LoginPage(){
        System.out.println("login Page Created");
    }
}
public class Runner {
    public static void main(String[] args){
        BasePage basePage = new LoginPage();
    }
}
