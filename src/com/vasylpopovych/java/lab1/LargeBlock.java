package com.vasylpopovych.java.lab1;

public class LargeBlock extends Toy implements LargeToy, Block {
    public LargeBlock(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void build() {
        System.out.println(getName() + " is building (large block)");
    }
}