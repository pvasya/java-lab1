package com.vasylpopovych.java.lab1;

public class LargeBall extends Toy implements LargeToy, Ball {
    public LargeBall(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void bounce() {
        System.out.println(getName() + " is bouncing (large ball)");
    }
}