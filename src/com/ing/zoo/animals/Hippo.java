package com.ing.zoo.animals;

import com.ing.zoo.traits.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public Hippo(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "splash";
    }

    public void eatLeaves() {
        System.out.println(getName() + ": munch munch lovely");
    }
}