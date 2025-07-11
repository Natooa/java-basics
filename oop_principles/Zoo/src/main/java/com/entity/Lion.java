package com.entity;

import com.conctract.AnimalBehavior;
import com.model.Animal;

public class Lion extends Animal{
    private boolean mane;

    public Lion(String name, int age, boolean mane) {
        super(name, age);
        this.mane = mane;
    }

    @Override
    public void makeSound() {
        System.out.println("RUUUUHHHHHHH");
    }
}
