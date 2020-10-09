package com.floreo;

import java.util.HashMap;

public class Main {

    //single line comment

    /*
    multi line comment
     */

    /**
    green comment
     */

    //declare
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static boolean myBoolean;
    static char myChar;
    static String myString;

    static HashMap<Integer, String> importantBirthdays = new HashMap<>();


    public static void main(String[] args) {

        importantBirthdays.put(18, "you can now vote");
        importantBirthdays.put(21, "you can now drink");

        int[] arr = new int[5];

        String birthdayMessage = importantBirthdays.get(21);

        boolean isValuePresent = importantBirthdays.containsValue("you can now drink");

        System.out.println(arr);
    }
}
