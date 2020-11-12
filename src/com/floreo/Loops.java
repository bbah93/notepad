package com.floreo;

public class Loops {

    public static void main(String[] args) {
        myNestedLoop(7);
    }

    public static void myNestedLoop(int n){
            int sum = 1;
            int innerSum = 1;
        for(int i = 0; i < n; i++){
            sum += sum;

            for(int j = 0; j < n; j++){
               innerSum += innerSum;
            }


        }
    }


}
