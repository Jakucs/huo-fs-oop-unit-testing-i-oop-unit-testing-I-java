package com.codecool.animal;

public class Lion extends Animal{

    public Lion(String name, int age, int health) {
        super(name, age, health);
    }

    @Override
    public void makeSound() {
        System.out.println("roars loudly: Rooooar!");
    }
}