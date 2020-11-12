package com.floreo.di;

public class MyDIMain {


    public static void main(String[] args) {

        Engine myEng = new Engine();


        Car myCar = new Car();

        myCar.setEngine(myEng);

        System.out.println(myCar.engine);

    }
}
