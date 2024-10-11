package com.vasylpopovych.java.lab1.test;

import com.vasylpopovych.java.lab1.gameroom.toys.AGE_GROUP;
import com.vasylpopovych.java.lab1.gameroom.toys.SIZE;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.BallToy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallToyTest {
    private BallToy ball;

    @BeforeEach
    void setUp() {
        ball = new BallToy("SkyBall", 30.0, AGE_GROUP.TEENS, SIZE.MEDIUM);
    }

    @Test
    void getName() {
        assertEquals("SkyBall", ball.getName());
    }

    @Test
    void getPrice() {
        assertEquals(30.0, ball.getPRICE());
    }

    @Test
    void getAgeGroup() {
        assertEquals(AGE_GROUP.TEENS, ball.getAgeGroup());
    }

    @Test
    void getSizeOfToy() { assertEquals(SIZE.MEDIUM, ball.getSizeOfToy()); }

    @Test
    void toStringTest() {
        String expected = "Toy [name=SkyBall, price=30.0, ageGroup=TEENS, size=MEDIUM]";
        assertEquals(expected, ball.toString());
    }
}