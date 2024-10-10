package com.vasylpopovych.java.lab1;

public class MediumCar extends Toy implements MediumToy, Car {
    public MediumCar(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving (medium car)");
    }
}