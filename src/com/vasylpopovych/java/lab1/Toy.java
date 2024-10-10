package com.vasylpopovych.java.lab1;

public abstract class Toy {
    private final String NAME;
    private final double PRICE;
    private final AGE_GROUP ageGroup;

    public Toy(String name, double price, AGE_GROUP ageGroup) {
        this.NAME = name;
        this.PRICE = price;
        this.ageGroup = ageGroup;
    }

    public String getName() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    public AGE_GROUP getAgeGroup() {
        return ageGroup;
    }

    @Override
    public String toString() {
        return "Toy [name=" + NAME + ", price=" + PRICE + ", ageGroup=" + ageGroup + "]";
    }
}