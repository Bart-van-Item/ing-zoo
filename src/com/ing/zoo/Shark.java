package com.ing.zoo;

public class Shark extends Animal {
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