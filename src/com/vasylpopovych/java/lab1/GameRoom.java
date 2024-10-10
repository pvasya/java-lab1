package com.vasylpopovych.java.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GameRoom {
    private final List<Toy> TOYS;
    private double budget;

    public GameRoom(double budget) {
        this.budget = budget;
        this.TOYS = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        if (toy.getPRICE() <= budget) {
            TOYS.add(toy);
            budget -= toy.getPRICE();
        } else {
            System.out.println("Not enough budget for toy: " + toy.getName());
        }
    }

    public void sortToysByPrice() {
        TOYS.sort(Comparator.comparingDouble(Toy::getPRICE));
    }

    public List<Toy> findToysByType(Class<?> type) {
        return TOYS.stream().filter(type::isInstance).collect(Collectors.toList());
    }

    public List<Toy> findToysByAgeGroup(AGE_GROUP ageGroup) {
        return TOYS.stream().filter(toy -> toy.getAgeGroup() == ageGroup).collect(Collectors.toList());
    }

    public List<Toy> findToysByParameters(Double minPrice, Double maxPrice, AGE_GROUP ageGroup) {
        return TOYS.stream()
                .filter(toy -> (minPrice == null || toy.getPRICE() >= minPrice) &&
                        (maxPrice == null || toy.getPRICE() <= maxPrice) &&
                        (ageGroup == null || toy.getAgeGroup() == ageGroup))
                .collect(Collectors.toList());
    }

    public void displayToys() {
        TOYS.forEach(System.out::println);
    }
}
