package com.vasylpopovych.java.lab1;

public class SmallDoll extends Toy implements SmallToy, Doll {
    public SmallDoll(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " is talking (small doll)");
    }
}