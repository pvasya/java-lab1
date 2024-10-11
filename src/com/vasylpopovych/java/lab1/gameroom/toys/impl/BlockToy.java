package com.vasylpopovych.java.lab1.gameroom.toys.impl;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.Block;
import com.vasylpopovych.java.lab1.gameroom.toys.Toy;

public class BlockToy extends Toy implements Block {
    public BlockToy(String name, double price, AGE_GROUP ageGroup, SIZE sizeOfToy) {
        super(name, price, ageGroup, sizeOfToy);
    }

    @Override
    public void build() {
        System.out.println(getName() + " is building ("+getSizeOfToy()+")");
    }
}
