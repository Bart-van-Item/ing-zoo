package com.ing.zoo;

import com.ing.zoo.traits.Carnivore;
import com.ing.zoo.traits.Herbivore;
import com.ing.zoo.traits.TrickPerformer;
import com.ing.zoo.animals.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Shark("bruce"),
                new Beaver("barry"),
                new OrangeLion("ing")
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ 'exit' om te stoppen.");

        while (true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().trim();

            if (input.equals("exit")) {
                System.out.println("Tot ziens!");
                break;
            }

            if (input.equals("hello")) {
                for (Animal animal : animals) {
                    animal.sayHello();
                }
            } else if (input.startsWith("hello ")) {
                String name = input.substring("hello ".length()).trim();
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(name)) {
                        animal.sayHello();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Unknown animal: " + name);
                }
            } else if (input.equals("give leaves")) {
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
            } else if (input.equals("give meat")) {
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
            } else if (input.equals("perform trick")) {
                for (Animal animal : animals) {
                    if (animal instanceof TrickPerformer) {
                        ((TrickPerformer) animal).performTrick();
                    }
                }
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}