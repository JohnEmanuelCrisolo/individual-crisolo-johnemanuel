package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        System.out.println("*** Ballpen Information Program ***");
        System.out.println("Please enter the details below:\n");

        Scanner scanner = new Scanner(System.in);

        Ballpen ballpen = new Ballpen();

        System.out.print("Enter ballpen brand: ");
        ballpen.setBrand(scanner.nextLine());

        System.out.print("Enter color: ");
        ballpen.setColor(scanner.nextLine());

        System.out.print("Enter PointSize: ");
        ballpen.setPointSize(scanner.nextDouble());

        System.out.print("Enter weight; ");
        ballpen.setWeightInGrams(scanner.nextDouble());

        ballpen.getBrand();

        System.out.println("\n=== Ballpen Details ===");

        System.out.println("Brand chosen: " + ballpen.getBrand());
        System.out.println("Color: " + ballpen.getColor());
        System.out.println("PointSize: " + ballpen.getPointSize());
        System.out.println("Weight in grams: " + ballpen.getWeightInGrams());



    }
}
