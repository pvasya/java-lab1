package com.vasylpopovych.java.lab1;

public class LargeCar extends Toy implements LargeToy, Car {
    public LargeCar(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving (large car)");
    }
}