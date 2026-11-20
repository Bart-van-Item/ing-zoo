package com.ing.zoo.animals;

import com.ing.zoo.traits.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public Zebra(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "zebra zebra";
    }

    public void eatLeaves() {
        System.out.println(getName() + ": munch munch zank yee bra");
    }
}