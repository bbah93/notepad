package com.floreo.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {


    public static void main(String[] args) {

        MyStatic myStaticObj = new MyStatic();
        int num = myStaticObj.myNumber;

        myStaticObj.add(1, 2, 3);

        int statNumber = MyStatic.myStatNumber;
    }



}