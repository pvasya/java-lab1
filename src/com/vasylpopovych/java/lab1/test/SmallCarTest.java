package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.SmallCar;
import com.vasylpopovych.java.lab1.AGE_GROUP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallCarTest {
    private SmallCar smallCar;

    @BeforeEach
    void setUp() {
        smallCar = new SmallCar("Small Truck", 70, AGE_GROUP.TEENS);
    }

    @Test
    void getName() {
        assertEquals("Small Truck", smallCar.getName());
    }

    @Test
    void getPrice() {
        assertEquals(70, smallCar.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.TEENS, smallCar.getAgeGroup());
    }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Small Truck, price=70.0, ageGroup=TEENS]";
        assertEquals(expected, smallCar.toString());
    }
}