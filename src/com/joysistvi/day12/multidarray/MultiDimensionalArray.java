package com.joysistvi.day12.multidarray;
import java.util.Scanner;
public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Coordinates: rows and column
        int [][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10},
        };
//        System.out.println(numbers[1][1]);
//        System.out.println(numbers[2].length);

//        for (int rows = 0; rows < numbers.length; rows++){
//            for ( int column = 0; column < numbers[rows].length; column++) {
//                System.out.println(numbers[rows][column]);
//            }
//            System.out.println();
//        }
//        System.out.println("\nTraversing a multi-dimensional array using  for-each loop");
//        for (int [] rows: numbers) {
//            for (int column: rows) {
//                System.out.println(column);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

// Declare a multidimensional array with a specified size only
        String[][] planets = new String[2][5];

        for (int rows = 0; rows < planets.length; rows++) {
            for (int column = 0; column < planets[rows].length; column++) {
                System.out.print("Enter planet[" + (rows + 1) + "][" + (column + 1) + "]: ");
                planets[rows][column] = scanner.nextLine();
            }

            System.out.println();
        }
        for ( String [] rows: planets){
            System.out.print("[ ");
            for (String column : rows) {
                System.out.print(column + " ");
            }
            System.out.println(" ]");
        }


    }
}
