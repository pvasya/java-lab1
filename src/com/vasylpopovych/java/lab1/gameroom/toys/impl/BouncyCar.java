package com.vasylpopovych.java.lab1.gameroom.toys.impl;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.Ball;
import com.vasylpopovych.java.lab1.gameroom.toys.Car;
import com.vasylpopovych.java.lab1.gameroom.toys.Toy;

public class BouncyCar extends Toy implements Car, Ball {
    public BouncyCar(String name, double price, AGE_GROUP ageGroup, SIZE sizeOfToy) {
        super(name, price, ageGroup, sizeOfToy);
    }

    @Override
    public void bounce() {
        System.out.println(getName() + " is bouncing ("+getSizeOfToy()+")");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving ("+getSizeOfToy()+")");
    }
}
