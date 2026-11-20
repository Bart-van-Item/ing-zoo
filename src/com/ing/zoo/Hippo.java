package com.ing.zoo;

public class Hippo extends Animal {
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