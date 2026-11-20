package com.ing.zoo.animals;

import com.ing.zoo.traits.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "roooaoaaaaar";
    }

    public void eatMeat() {
        System.out.println(getName() + ": nomnomnom thx mate");
    }
}
