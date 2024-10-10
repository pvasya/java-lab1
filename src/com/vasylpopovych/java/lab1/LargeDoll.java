package com.vasylpopovych.java.lab1;

public class LargeDoll extends Toy implements LargeToy, Doll {
    public LargeDoll(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " is talking (large doll)");
    }
}