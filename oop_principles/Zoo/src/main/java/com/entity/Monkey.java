package com.entity;

import com.model.Animal;

public class Monkey extends Animal {
    private int iq;

    public Monkey(String name, int age, int iq) {
        super(name, age);
        if(iq < 0) {
            throw new IllegalArgumentException("Iq cannot be less than 0");
        }
        this.iq = iq;
    }

    @Override
    public void makeSound() {
        System.out.println("U U U A A A");
    }
}
