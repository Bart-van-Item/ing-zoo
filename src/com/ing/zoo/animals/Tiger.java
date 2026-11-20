package com.ing.zoo.animals;

import com.ing.zoo.traits.Carnivore;
import com.ing.zoo.traits.TrickPerformer;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    public Tiger(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "rraaarww";
    }

    public void eatMeat() {
        System.out.println(getName() + ": nomnomnom oink wubalubadubdub");
    }

    public void performTrick() {
        Random random = new Random();
        String trick = random.nextInt(2) == 0 ? "jumps in tree" : "scratches ears";
        System.out.println(getName() + ": " + trick);
    }
}