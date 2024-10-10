package com.vasylpopovych.java.lab1;

public class SmallBlock extends Toy implements SmallToy, Block {
    public SmallBlock(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void build() {
        System.out.println(getName() + " is building (small block)");
    }
}