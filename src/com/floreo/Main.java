package com.floreo;


import com.floreo.OOP.Apple;
import com.floreo.designpatterns.StaticFactoryMethod;

public class Main {


    public static void main(String[] args) {

        StaticFactoryMethod staticFactoryMethod = StaticFactoryMethod.getNewInstance();
        StaticFactoryMethod staticFactoryMethod2 = StaticFactoryMethod.getNewInstance();
        StaticFactoryMethod staticFactoryMethod3 = StaticFactoryMethod.getNewInstance();
        StaticFactoryMethod staticFactoryMethod4 = StaticFactoryMethod.getNewInstance();
        StaticFactoryMethod staticFactoryMethod5 = StaticFactoryMethod.getNewInstance();
        StaticFactoryMethod staticFactoryMethod6 = StaticFactoryMethod.getNewInstance();

        System.out.println(staticFactoryMethod);
        System.out.println(staticFactoryMethod.instanceCount);
        System.out.println(staticFactoryMethod2);
        System.out.println(staticFactoryMethod2.instanceCount);
        System.out.println(staticFactoryMethod3);
        System.out.println(staticFactoryMethod3.instanceCount);
        System.out.println(staticFactoryMethod4);
        System.out.println(staticFactoryMethod4.instanceCount);
        System.out.println(staticFactoryMethod5);
        System.out.println(staticFactoryMethod5.instanceCount);
        System.out.println(staticFactoryMethod6);
        System.out.println(staticFactoryMethod6.instanceCount);



        Apple myApple = new Apple();

    }
}
