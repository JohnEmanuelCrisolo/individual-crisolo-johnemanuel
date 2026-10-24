package com.joysistvi.day10.nestedforloop;

public class Activity7Crisolo {
    public static void main(String[] args) {

        System.out.println("\n *** Multiplication table" + " ***");

        int k = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print("");
            System.out.println("\nMultiplication table of " + k++);

            for (int j = 1; j <= 10; j++) {



                System.out.println(i + " x " + j + " = " + (i * j));


            }

        }




    }
}