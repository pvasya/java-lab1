package com.vasylpopovych.java.lab1.gameroom.toys.impl;

import com.vasylpopovych.java.lab1.gameroom.toys.Toy;
import com.vasylpopovych.java.lab1.gameroom.toys.Car;
import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;

public class CarToy extends Toy implements Car {
    public CarToy(String name, double price, AGE_GROUP ageGroup, SIZE sizeOfToy) {
        super(name, price, ageGroup, sizeOfToy);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving ("+getSizeOfToy()+")");
    }
}