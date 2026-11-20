package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal {
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