package com.vasylpopovych.java.lab1;

public class MediumBall extends Toy implements MediumToy, Ball {
    public MediumBall(String name, double price, AGE_GROUP ageGroup) {
        super(name, price, ageGroup);
    }

    @Override
    public void bounce() {
        System.out.println(getName() + " is bouncing (medium ball)");
    }
}