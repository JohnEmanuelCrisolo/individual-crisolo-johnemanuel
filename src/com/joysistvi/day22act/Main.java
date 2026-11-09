package com.joysistvi.day22act;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Ballpen Details ***");
        System.out.print("Enter brand: ");
        String ballpenBrand = scanner.nextLine();
        System.out.print("Enter color: ");
        String ballpenColor = scanner.nextLine();
        System.out.print("Enter point size: ");
        double pointSize = scanner.nextDouble();
        System.out.print("Enter weight in grams: ");
        double ballpenWeight = scanner.nextDouble();
        scanner.nextLine();

        Ballpen ballpen = new Ballpen(ballpenBrand, ballpenColor, pointSize, ballpenWeight);

        System.out.println("\n*** Marker Details ***");
        System.out.print("Enter brand: ");
        String markerBrand = scanner.nextLine();
        System.out.print("Enter color: ");
        String markerColor = scanner.nextLine();
        System.out.print("Enter weight in grams: ");
        double markerWeight = scanner.nextDouble();
        System.out.print("Is it permanent? (true/false): ");
        boolean permanent = scanner.nextBoolean();

        Marker marker = new Marker(markerBrand, markerColor, markerWeight, permanent);

        System.out.println("\n==== Ballpen ====");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n==== Marker ====");
        System.out.println("\n Writing with a marker. \n\n" + marker);
        marker.write();
    }
}
