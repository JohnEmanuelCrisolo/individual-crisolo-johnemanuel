
package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class Activity8Crisolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        // Enter 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + "[" + (i + 1) + "]"  + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Display all numbers
       for (int number : numbers) {
           System.out.println(number);
       }

        // Calculate the average
        double average = (double) sum / numbers.length;

       // find the highest number
        int highest = numbers[0];
        int lowest = numbers[0];

        // Lowest and Highest
        for (int i = 0; i < numbers.length; i++){
            if (highest < numbers[i]) {
                highest = numbers[i];
            }
            if (lowest > numbers[i]){
                lowest = numbers[i];
            }

        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest number: " + highest);
        System.out.println("lowest number: " + lowest);
        scanner.close();
    }
}
