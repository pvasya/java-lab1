package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.DollToy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollToyTest {
    private DollToy doll;

    @BeforeEach
    void setUp() {
        doll = new DollToy("Barbie", 130.0, AGE_GROUP.TEENS, SIZE.LARGE);
    }

    @Test
    void getName() {
        assertEquals("Barbie", doll.getName());
    }

    @Test
    void getPrice() {
        assertEquals(130.0, doll.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.TEENS, doll.getAgeGroup());
    }

    @Test
    void getSizeOfToy() { assertEquals(SIZE.LARGE, doll.getSizeOfToy()); }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Barbie, price=130.0, ageGroup=TEENS, size=LARGE]";
        assertEquals(expected, doll.toString());
    }
}