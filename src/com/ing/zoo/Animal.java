package com.ing.zoo;

public abstract class Animal {
    private final String name;    // Private final name so it cant be changed from the outside

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Each animal decides what its hello sounds like
    protected abstract String getHelloText();

    public void sayHello() {
        System.out.println(name + ": " + getHelloText());
    }
}