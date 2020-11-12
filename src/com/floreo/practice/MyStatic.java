package com.floreo.practice;

public class MyStatic {

    static int myStatNumber = 1;
    int myNumber = 1;

    public static void myStatMethod(){
        System.out.println("I am static");
    }

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }
    public double add(double a, double b, double c){
        return a + b + c;
    }

    public void myMethodTwo(){
        System.out.println("I am not static");
    }
// comment stuff
}
