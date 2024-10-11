package com.vasylpopovych.java.lab1.gameroom.toys;

public abstract class Toy {
    private final String NAME;
    private final double PRICE;
    private final AGE_GROUP ageGroup;
    private final SIZE sizeOfToy;

    public Toy(String name, double price, AGE_GROUP ageGroup, SIZE sizeOfToy) {
        this.NAME = name;
        this.PRICE = price;
        this.ageGroup = ageGroup;
        this.sizeOfToy = sizeOfToy;
    }

    public SIZE getSizeOfToy() { return sizeOfToy; }

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
        return "Toy [name=" + NAME + ", price=" + PRICE + ", ageGroup=" + ageGroup + ", size=" + sizeOfToy + "]";
    }
}