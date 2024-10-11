package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;

import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.BouncyCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BouncyCarTest {
    private BouncyCar bouncyCar;

    @BeforeEach
    void setUp() {
        bouncyCar = new BouncyCar("Big Truck", 150.0, AGE_GROUP.KIDS, SIZE.LARGE);
    }

    @Test
    void getName() {
        assertEquals("Big Truck", bouncyCar.getName());
    }

    @Test
    void getPrice() {
        assertEquals(150.0, bouncyCar.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.KIDS, bouncyCar.getAgeGroup());
    }

    @Test
    void getSizeOfToy() { assertEquals(SIZE.LARGE, bouncyCar.getSizeOfToy()); }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Big Truck, price=150.0, ageGroup=KIDS, size=LARGE]";
        assertEquals(expected, bouncyCar.toString());
    }
}