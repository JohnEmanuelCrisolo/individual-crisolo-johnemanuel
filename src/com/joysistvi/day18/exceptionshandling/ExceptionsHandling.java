package com.joysistvi.day18.exceptionshandling;

public class ExceptionsHandling {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException


        try {
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println(numbers[6]);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("Hello");
    }
}