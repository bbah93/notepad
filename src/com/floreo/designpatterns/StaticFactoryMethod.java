package com.floreo.designpatterns;

import java.util.Date;

public class StaticFactoryMethod {

    public static int instanceCount;


    private StaticFactoryMethod() {}

    private StaticFactoryMethod(Date date){
        System.out.println("Logging the date: " + date);
    }

    public static StaticFactoryMethod getNewInstance(){

        if(instanceCount < 5){
            instanceCount++;
            return new StaticFactoryMethod();
        }
       throw new UnsupportedOperationException("Too Many Instances! You can only make up to 5 (five) of them!!!");
    }

    public static StaticFactoryMethod getNewInstanceAndLogDate(){
        return new StaticFactoryMethod(new Date());
    }
}
