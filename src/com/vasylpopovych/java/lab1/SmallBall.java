package com.vasylpopovych.java.lab1;

public class SmallBall extends Toy implements SmallToy, Ball {
    public SmallBall(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void bounce() {
        System.out.println(getName() + " is bouncing (small ball)");
    }
}