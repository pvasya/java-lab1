package com.vasylpopovych.java.lab1.test;


import com.vasylpopovych.java.lab1.gameroom.GameRoom;
import com.vasylpopovych.java.lab1.gameroom.toys.*;
import com.vasylpopovych.java.lab1.gameroom.toys.Toy;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.BouncyCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameRoomTest {

    private GameRoom gameRoom;

    @BeforeEach
    void setUp() {
        gameRoom = new GameRoom(500.0);
    }

    @Test
    void addToyWithSufficientBudgetShouldAddToy() {
        Toy car = new BouncyCar("Mini Car", 50.0, AGE_GROUP.KIDS, SIZE.LARGE);
        gameRoom.addToy(car);

        List<Toy> toys = gameRoom.findToysByType(BouncyCar.class);
        assertEquals(1, toys.size());
        assertEquals(car, toys.getFirst());
    }

    @Test
    void addToyWithoutSufficientBudgetShouldNotAddToy() {
        Toy bouncyCar = new BouncyCar("Expensive Doll", 500.0, AGE_GROUP.TEENS, SIZE.MEDIUM);
        gameRoom.addToy(bouncyCar);

        List<Toy> toys = gameRoom.findToysByType(BouncyCar.class);
        assertEquals(1, toys.size());
    }

    @Test
    void sortToysByPriceShouldSortToys() {
        gameRoom.addToy(new BouncyCar("Mini Car", 50.0, AGE_GROUP.KIDS, SIZE.MEDIUM));
        gameRoom.addToy(new BouncyCar("Medium Doll", 150.0, AGE_GROUP.TEENS, SIZE.MEDIUM));
        gameRoom.addToy(new BouncyCar("Large Ball", 100.0, AGE_GROUP.KIDS, SIZE.LARGE));

        gameRoom.sortToysByPrice();

        List<Toy> sortedToys = gameRoom.findToysByType(Toy.class);
        assertEquals("Mini Car", sortedToys.get(0).getName());
        assertEquals("Large Ball", sortedToys.get(1).getName());
        assertEquals("Medium Doll", sortedToys.get(2).getName());
    }

    @Test
    void findToysByAgeGroupShouldReturnCorrectToys() {
        gameRoom.addToy(new BouncyCar("Mini Car", 50.0, AGE_GROUP.KIDS, SIZE.SMALL));
        gameRoom.addToy(new BouncyCar("Medium Doll", 150.0, AGE_GROUP.TEENS, SIZE.MEDIUM));
        gameRoom.addToy(new BouncyCar("Large Ball", 100.0, AGE_GROUP.KIDS, SIZE.LARGE));

        List<Toy> toddlersToys = gameRoom.findToysByAgeGroup(AGE_GROUP.KIDS);
        assertEquals(2, toddlersToys.size());
    }

    @Test
    void findToysByParametersShouldReturnFilteredToys() {
        gameRoom.addToy(new BouncyCar("Mini Car", 50.0, AGE_GROUP.KIDS, SIZE.SMALL));
        gameRoom.addToy(new BouncyCar("Medium Doll", 150.0, AGE_GROUP.TEENS, SIZE.MEDIUM));
        gameRoom.addToy(new BouncyCar("Large Ball", 100.0, AGE_GROUP.KIDS, SIZE.LARGE));
        gameRoom.addToy(new BouncyCar("Mini Car 2", 30.0, AGE_GROUP.KIDS, SIZE.SMALL));

        List<Toy> filteredToys = gameRoom.findToysByParameters(30.0, 100.0, AGE_GROUP.KIDS, SIZE.SMALL);
        assertEquals(2, filteredToys.size());
    }
}
