
package com.joysistvi.day6.ifstatement;

public class ifElseIfLadder {
    public static void main(String[] args) {
        int grade = -5;
        String result;

        if (grade >= 1 && grade <= 100) {

            if (grade <= 70) { // 1 - 70
                result = "F";
            } else if (grade <= 80) { // 71 - 80
                result = "C";
            } else if (grade <= 90) { // 81 - 90
                result = "B";
            } else { // 91 - 100
                result = "A";
            }

            System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else {
            System.out.println("Invalid Grade");
        }
    }
}
