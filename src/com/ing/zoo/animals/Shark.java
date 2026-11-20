package com.ing.zoo.animals;

import com.ing.zoo.traits.Carnivore;

public class Shark extends Animal implements Carnivore {
    public Shark(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "blub blub";
    }

    public void eatMeat() {
        System.out.println(getName() + ": chomp chomp");
    }
}