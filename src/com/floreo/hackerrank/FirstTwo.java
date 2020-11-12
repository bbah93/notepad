package com.floreo.hackerrank;

public class FirstTwo {

    final static int  myNum = 10;

    public static void main(String[] args) {
        System.out.println(myNum);

        myNum = 12;
        System.out.println(firstTwoLetters("Hello"));
    }

    public static String firstTwoLetters(String str){

        //first check string size
        if(str.length()  <= 2){
            return str;
        } else{
            return str.substring(0, 2);

        }

    }
}
