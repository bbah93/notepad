package com.floreo.di;

public class Car {

    Engine engine;
    //constructor providing dependency (We've been using DI this whole time!!)
    public Car(){

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
