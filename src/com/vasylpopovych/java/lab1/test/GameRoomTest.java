package com.vasylpopovych.java.lab1.test;


import com.vasylpopovych.java.lab1.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameRoomTest {

    private GameRoom gameRoom;

    @BeforeEach
    void setUp() {
        gameRoom = new GameRoom(300.0);
    }

    @Test
    void addToyWithSufficientBudgetShouldAddToy() {
        Toy car = new SmallCar("Mini Car", 50.0, AGE_GROUP.KIDS);
        gameRoom.addToy(car);

        List<Toy> toys = gameRoom.findToysByType(SmallCar.class);
        assertEquals(1, toys.size());
        assertEquals(car, toys.getFirst());
    }

    @Test
    void addToyWithoutSufficientBudgetShouldNotAddToy() {
        Toy doll = new MediumDoll("Expensive Doll", 500.0, AGE_GROUP.TEENS);
        gameRoom.addToy(doll);

        List<Toy> toys = gameRoom.findToysByType(MediumDoll.class);
        assertEquals(0, toys.size());
    }

    @Test
    void sortToysByPriceShouldSortToys() {
        gameRoom.addToy(new SmallCar("Mini Car", 50.0, AGE_GROUP.KIDS));
        gameRoom.addToy(new MediumDoll("Medium Doll", 150.0, AGE_GROUP.TEENS));
        gameRoom.addToy(new LargeBall("Large Ball", 100.0, AGE_GROUP.KIDS));

        gameRoom.sortToysByPrice();

        List<Toy> sortedToys = gameRoom.findToysByType(Toy.class);
        assertEquals("Mini Car", sortedToys.get(0).getName());
        assertEquals("Large Ball", sortedToys.get(1).getName());
        assertEquals("Medium Doll", sortedToys.get(2).getName());
    }

    @Test
    void findToysByAgeGroupShouldReturnCorrectToys() {
        gameRoom.addToy(new SmallCar("Mini Car", 50.0, AGE_GROUP.KIDS));
        gameRoom.addToy(new MediumDoll("Medium Doll", 150.0, AGE_GROUP.TEENS));
        gameRoom.addToy(new LargeBall("Large Ball", 100.0, AGE_GROUP.KIDS));

        List<Toy> toddlersToys = gameRoom.findToysByAgeGroup(AGE_GROUP.KIDS);
        assertEquals(2, toddlersToys.size());
    }

    @Test
    void findToysByParametersShouldReturnFilteredToys() {
        gameRoom.addToy(new SmallCar("Mini Car", 50.0, AGE_GROUP.KIDS));
        gameRoom.addToy(new MediumDoll("Medium Doll", 150.0, AGE_GROUP.TEENS));
        gameRoom.addToy(new LargeBall("Large Ball", 100.0, AGE_GROUP.KIDS));
        gameRoom.addToy(new SmallCar("Mini Car 2", 20.0, AGE_GROUP.KIDS));

        List<Toy> filteredToys = gameRoom.findToysByParameters(30.0, 100.0, AGE_GROUP.KIDS);
        assertEquals(2, filteredToys.size());
    }
}
