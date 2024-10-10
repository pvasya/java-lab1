package com.vasylpopovych.java.lab1;

public class SmallCar extends Toy implements SmallToy, Car {
    public SmallCar(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving (small car)");
    }
}