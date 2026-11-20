package com.ing.zoo;

import java.util.Random;

public class Beaver extends Animal {
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