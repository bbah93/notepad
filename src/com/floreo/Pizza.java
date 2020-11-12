package com.floreo;

public class Pizza {

    private String cheese;
    private int toppingCount;
    private boolean fresh;
    private String[] toppings;

    public Pizza(String cheese, int toppingCount, boolean fresh) {
        this.cheese = cheese;
        this.toppingCount = toppingCount;
        this.fresh = fresh;
    }


    public Pizza(String cheese) {
        this.cheese = cheese;

    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public int getToppingCount() {
        return toppingCount;
    }

    public void setToppingCount(int toppingCount) {
        this.toppingCount = toppingCount;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
