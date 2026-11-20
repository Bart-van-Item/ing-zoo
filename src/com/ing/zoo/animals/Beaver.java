package com.ing.zoo.animals;

import com.ing.zoo.traits.Herbivore;
import com.ing.zoo.traits.TrickPerformer;

import java.util.Random;

public class Beaver extends Animal implements Herbivore, TrickPerformer {
    public Beaver(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "chirp chirp";
    }

    public void eatLeaves() {
        System.out.println(getName() + ": nibble nibble crunchy bark");
    }

    public void performTrick() {
        Random random = new Random();
        String trick = random.nextInt(2) == 0 ? "builds a dam" : "slaps the water with its tail";
        System.out.println(getName() + ": " + trick);
    }
}