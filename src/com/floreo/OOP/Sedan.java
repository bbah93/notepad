package com.floreo.OOP;

public class Sedan implements Car {


    @Override
    public void startEngine(boolean hasKey) {

    }

    @Override
    public void breakCar() {

    }

    @Override
    public int getCurrentSpeed() {
        return 0;
    }

    public String showTurnSignal(boolean isTurnRight){
        String leftSignal = "going left";
        String rightSignal = "going right";

        if(!isTurnRight){
            return leftSignal;
        } else {
            return rightSignal;
        }
    }
}
