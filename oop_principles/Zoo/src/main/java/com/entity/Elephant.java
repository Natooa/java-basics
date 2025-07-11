package com.entity;

import com.model.Animal;

public class Elephant extends Animal {
    private boolean trunk;

    public Elephant(String name, int age, boolean trunk) {
        super(name, age);
        this.trunk = trunk;
    }

    @Override
    public void makeSound() {
        System.out.println("OOOOOOOHHHHHHHH");
    }
}
