package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.LargeCar;
import com.vasylpopovych.java.lab1.AGE_GROUP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargeCarTest {
    private LargeCar largeCar;

    @BeforeEach
    void setUp() {
        largeCar = new LargeCar("Big Truck", 150.0, AGE_GROUP.KIDS);
    }

    @Test
    void getName() {
        assertEquals("Big Truck", largeCar.getName());
    }

    @Test
    void getPrice() {
        assertEquals(150.0, largeCar.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.KIDS, largeCar.getAgeGroup());
    }

    @Test
    void toStringTest() {
        String expected = "Toy [name=Big Truck, price=150.0, ageGroup=KIDS]";
        assertEquals(expected, largeCar.toString());
    }
}