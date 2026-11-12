
package com.joysistvi.abstraction;

public class Dog extends Animal implements Pet, Swimmer {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof! Woof!");
    }

    @Override
    public void play() {

        System.out.println("Plays fetch");

    }

    @Override
    public void showAffection() {

        System.out.println("Wags tail happily");

    }

    @Override
    public void swim() {
        System.out.println("Swims in the river");
    }
}
