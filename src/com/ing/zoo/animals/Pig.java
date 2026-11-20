package com.ing.zoo.animals;

import com.ing.zoo.traits.Carnivore;
import com.ing.zoo.traits.Herbivore;
import com.ing.zoo.traits.TrickPerformer;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {
    public Pig(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "splash";
    }

    public void eatLeaves() {
        System.out.println(getName() + ": munch munch oink");
    }

    public void eatMeat() {
        System.out.println(getName() + ": nomnomnom oink thx");
    }

    public void performTrick() {
        Random random = new Random();
        String trick = random.nextInt(2) == 0 ? "rolls in the mud" : "runs in circles";
        System.out.println(getName() + ": " + trick);
    }
}