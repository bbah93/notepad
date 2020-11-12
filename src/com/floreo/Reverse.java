package com.floreo;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverseString("Bobby"));
    }


    public static String reverseString(String str){

        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.reverse().toString();
    }
}
