
package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] studentName;
        String[] subjectName;
        double[][] grades;

        System.out.println("=================================");
        System.out.println("        Average Calculator");
        System.out.println("=================================");
        System.out.print("Enter number of students: ");
        int numberOfStudent = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        scanner.nextLine();

        subjectName = new String[numberOfSubjects];

        System.out.println("\nEnter subject names:");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectName[i] = scanner.nextLine();
        }

        studentName = new String[numberOfStudent];
        grades = new double[numberOfStudent][numberOfSubjects];

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentName[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(subjectName[j] + ": ");
                grades[i][j] = scanner.nextDouble();
            }

            scanner.nextLine();
        }

        System.out.println("\n=================================");
        System.out.println("          Grades Report");
        System.out.println("=================================");

        System.out.printf("%-15s", "Student");

        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.printf("%-30s", subjectName[j]);
        }

        System.out.println("Average");

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.printf("%-15s", studentName[i]);

            double sum = 0;

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%-30.0f", grades[i][j]);
                sum = sum + grades[i][j];
            }

            double average = sum / numberOfSubjects;

            System.out.printf("%.2f%n", average);
        }

        scanner.close();
    }
}
