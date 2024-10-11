package com.vasylpopovych.java.lab1.gameroom.toys.impl;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.Doll;
import com.vasylpopovych.java.lab1.gameroom.toys.Toy;

public class DollToy extends Toy implements Doll {
    public DollToy(String name, double price, AGE_GROUP ageGroup, SIZE sizeOfToy) {
        super(name, price, ageGroup, sizeOfToy);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " is talking ("+getSizeOfToy()+")");
    }
}
