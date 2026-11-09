package com.joysistvi.day22.inheritance;
// Parent / Super Class
public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name + "Is eating.");

    }

    public void makeSound(){
        System.out.println(name + "Make a sound");
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + age;

    }
}
