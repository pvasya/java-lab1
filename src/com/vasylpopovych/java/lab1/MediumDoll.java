package com.vasylpopovych.java.lab1;

public class MediumDoll extends Toy implements MediumToy, Doll {
    public MediumDoll(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " is talking (medium doll)");
    }
}