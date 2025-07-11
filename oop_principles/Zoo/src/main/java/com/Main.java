package com;

import com.entity.Elephant;
import com.entity.Lion;
import com.entity.Monkey;
import com.model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal [] animalArray = new Animal[3];

        animalArray[0] = new Lion("Simba", 25, true);
        animalArray[1] = new Elephant("John", 40, true);
        animalArray[2] = new Monkey("Raphiki", 80, 180);

        for(Animal animal : animalArray){
            System.out.println(animal);
            animal.makeSound();
        }

    }
}
