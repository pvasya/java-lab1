package com.vasylpopovych.java.lab1;

import com.vasylpopovych.java.lab1.gameroom.GameRoom;
import com.vasylpopovych.java.lab1.gameroom.toys.*;
import com.vasylpopovych.java.lab1.gameroom.toys.impl.*;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        GameRoom GameRoom = new GameRoom(1000);

        GameRoom.addToy(new BouncyCar("Mini Car1", 50, AGE_GROUP.KIDS, SIZE.SMALL));
        GameRoom.addToy(new CarToy("Large Car1", 350, AGE_GROUP.KIDS, SIZE.LARGE));
        GameRoom.addToy(new BouncyCar("Medium Car1", 20, AGE_GROUP.TEENS, SIZE.MEDIUM));
        GameRoom.addToy(new BallToy("Skyball", 40, AGE_GROUP.TODDLERS, SIZE.SMALL));
        GameRoom.addToy(new CarToy("Medium Car2", 70, AGE_GROUP.TODDLERS, SIZE.MEDIUM));
        GameRoom.addToy(new BouncyCar("Big Car2", 99, AGE_GROUP.TEENS, SIZE.LARGE));
        GameRoom.addToy(new BouncyCar("Mini Car3", 11, AGE_GROUP.KIDS, SIZE.SMALL));
        GameRoom.addToy(new DollToy("Barbie", 52, AGE_GROUP.KIDS, SIZE.LARGE));
        GameRoom.addToy(new CarToy("Standart Car3", 53, AGE_GROUP.KIDS, SIZE.MEDIUM));
        GameRoom.addToy(new BlockToy("Minecraft", 55, AGE_GROUP.TEENS, SIZE.SMALL));
        GameRoom.addToy(new BouncyCar("Large Car4", 870, AGE_GROUP.TEENS, SIZE.LARGE));
        GameRoom.addToy(new BallToy("Football", 32, AGE_GROUP.TODDLERS, SIZE.SMALL));

        System.out.println("The toys before sorting:");
        GameRoom.displayToys();

        GameRoom.sortToysByPrice();
        System.out.println("\nThe toys after sorting by price:");
        GameRoom.displayToys();

        GameRoom.sortToys(Comparator.comparing(Toy::getName));
        System.out.println("\nThe toys after sorting by name:");
        GameRoom.displayToys();

        System.out.println("\nThe toys for toddlers:");
        GameRoom.findToysByAgeGroup(AGE_GROUP.TODDLERS).forEach(System.out::println);

        System.out.println("\nThe toys for kids:");
        GameRoom.findToysByAgeGroup(AGE_GROUP.KIDS).forEach(System.out::println);

        System.out.println("\nThe toys for teens:");
        GameRoom.findToysByAgeGroup(AGE_GROUP.TEENS).forEach(System.out::println);

        System.out.println("\nDollImpl:");
        GameRoom.findToysByType(DollToy.class).forEach(System.out::println);

        System.out.println("\nLarge toys:");
        GameRoom.findToysBySize(SIZE.LARGE).forEach(System.out::println);

        System.out.println("\nfindToysByParameters(Double minPrice, Double maxPrice, AgeGroup ageGroup, SIZE sizeOfToy)");
        GameRoom.findToysByParameters(10., 300., AGE_GROUP.TEENS, SIZE.LARGE).forEach(System.out::println);
    }
}