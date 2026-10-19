package com.joysistvi.day5.operator;

public class TernaryOperator {
    public static void main (String[] args){
        int num = 100;
        int num2 = 1000;
        double balance = 6.7;

        if (num > balance) {
            System.out.println("You poor");

        }
        int age = 10;

        String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        System.out.println(result);

        int bigger = (num > num2) ? num : num2;
        System.out.println("Bigger number: " + bigger);

    }
}
