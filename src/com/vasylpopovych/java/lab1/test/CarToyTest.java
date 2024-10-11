package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;

import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.CarToy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarToyTest {
    private CarToy car;

    @BeforeEach
    void setUp() {
        car = new CarToy("Tesla", 150.0, AGE_GROUP.KIDS, SIZE.LARGE);
    }

    @Test
    void getName() {
        assertEquals("Tesla", car.getName());
    }

    @Test
    void getPrice() {
        assertEquals(150.0, car.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.KIDS, car.getAgeGroup());
    }

    @Test
    void getSizeOfToy() { assertEquals(SIZE.LARGE, car.getSizeOfToy()); }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Tesla, price=150.0, ageGroup=KIDS, size=LARGE]";
        assertEquals(expected, car.toString());
    }
}