
package com.joysistvi.polymorphism.methodoverriding;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // DOG INPUT
        System.out.println("--- DOG INFORMATION ---");

        System.out.print("Enter dog's name: ");
        String dogName = scanner.nextLine();

        System.out.print("Enter dog's age: ");
        int dogAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter dog's breed: ");
        String dogBreed = scanner.nextLine();

        Dog dog = new Dog(dogName, dogAge, dogBreed);

        // CAT INPUT
        System.out.println("\n--- CAT INFORMATION ---");

        System.out.print("Enter cat's name: ");
        String catName = scanner.nextLine();

        System.out.print("Enter cat's age: ");
        int catAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter cat's fur color: ");
        String furColor = scanner.nextLine();

        Cat cat = new Cat(catName, catAge, furColor);

        // DISPLAY RESULTS
        System.out.println("\n--- ANIMAL INFORMATION ---");

        System.out.println("\nDOG");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        dog.makeSound();

        System.out.println(cat);
        cat.makeSound();

        scanner.close();
    }
}
