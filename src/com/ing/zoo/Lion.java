package com.ing.zoo;

public class Lion extends Animal {
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
