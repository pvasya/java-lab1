package com.vasylpopovych.java.lab1;

public class MediumBlock extends Toy implements MediumToy, Block {
    public MediumBlock(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void build() {
        System.out.println(getName() + " is building (medium block)");
    }
}