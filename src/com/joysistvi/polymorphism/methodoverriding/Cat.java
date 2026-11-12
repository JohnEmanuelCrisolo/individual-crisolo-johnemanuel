
package com.joysistvi.polymorphism.methodoverriding;

public class Cat extends Animal {

    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " says Meow! Meow!");

    }
    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nFur Color: " + furColor;
    }

}
