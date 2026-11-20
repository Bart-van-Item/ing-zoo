package com.ing.zoo.animals;

public class OrangeLion extends Lion {
    public OrangeLion(String name) {
        super(name);
    }

    @Override
    protected String getHelloText() {
        return "roooaaar, welcome to ING!";
    }
}