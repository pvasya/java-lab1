package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.MediumCar;
import com.vasylpopovych.java.lab1.AGE_GROUP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumCarTest {
    private MediumCar mediumCar;

    @BeforeEach
    void setUp() {
        mediumCar = new MediumCar("Medium Truck", 100, AGE_GROUP.TEENS);
    }

    @Test
    void getName() {
        assertEquals("Medium Truck", mediumCar.getName());
    }

    @Test
    void getPrice() {
        assertEquals(100.0, mediumCar.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.TEENS, mediumCar.getAgeGroup());
    }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Medium Truck, price=100.0, ageGroup=TEENS]";
        assertEquals(expected, mediumCar.toString());
    }
}