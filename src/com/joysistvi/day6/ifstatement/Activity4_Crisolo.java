package com.joysistvi.day6.ifstatement;
import java.util.Scanner;


public class Activity4_Crisolo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age (Whole numbers only): ");
        int age = scanner.nextInt();

        String category;

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        }

        if (age <= 2) {
            category = "Baby";
        } else if (age <= 12) {
            category = "Child";
        } else if (age <= 19) {
            category = "Teenager";
        } else if (age <= 29) {
            category = "Young Adult";
        } else if (age <= 59) {
            category = "Adult";
        } else {
            category = "Senior";
        }
        scanner.close();

        System.out.println("Age: " + age);
        System.out.println("Category: " + category);

    }
}
