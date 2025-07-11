package com.model;

import com.conctract.AnimalBehavior;

public abstract class Animal implements AnimalBehavior {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " +  name + ", Age: " + age + ", type of Animal: " + getClass().getSimpleName();
    }

    public abstract void makeSound();
}
