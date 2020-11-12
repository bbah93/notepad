package com.floreo.OOP;

public class Apple {
    //field variables
    private boolean isRipe;
    private int seedCount;

    //empty constructor
    public Apple(){

    }

    public Apple(int seedCount, boolean isRipe){
        this.isRipe = isRipe;
         this.seedCount = seedCount;

    }

    public boolean getIsRipe(){
        return isRipe;
    }
    public int getSeedCount(){
        return seedCount;
    }

    public void setRipe(boolean myRipe){
        isRipe = myRipe;
    }

    public void setSeedCount(int mySeedCount){
        seedCount = mySeedCount;
    }

    //access, return type, name, parameters
    public int addApples(int myApple, int theirApples){
        //all logic inside of method body (i.e curly braces)
        //local variables
        int appleSum = myApple + theirApples;
       return appleSum;
    }

    public boolean compareApples(int ourApples, int otherApples){
                    //calling a method and providing args
        ourApples = addApples(10, 20 );
        otherApples = 16;

        //local variables
        boolean hasMoreApples;

        if(ourApples > otherApples){
            hasMoreApples = true;
            System.out.println("You have more apples");
        } else{
            System.out.println("You have less apples");
            hasMoreApples = false;
        }


        try {
            //  Block of code to try
        }
        catch(Exception e) {
            //  Block of code to handle errors
        } finally {
            //do some stuff
        }
        return hasMoreApples;
    }


}
