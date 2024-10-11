package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.BlockToy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlockToyTest {
    private BlockToy block;

    @BeforeEach
    void setUp() {
        block = new BlockToy("Minecraft", 99.0, AGE_GROUP.TEENS, SIZE.MEDIUM);
    }

    @Test
    void getName() {
        assertEquals("Minecraft", block.getName());
    }

    @Test
    void getPrice() {
        assertEquals(99.0, block.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.TEENS, block.getAgeGroup());
    }

    @Test
    void getSizeOfToy() { assertEquals(SIZE.MEDIUM, block.getSizeOfToy()); }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Minecraft, price=99.0, ageGroup=TEENS, size=MEDIUM]";
        assertEquals(expected, block.toString());
    }
}