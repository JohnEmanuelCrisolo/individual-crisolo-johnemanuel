package com.joysistvi.day11.singledarray;
import java.util.Scanner;

public class ArrayExampleWithSizeOnly {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Syntax
        // Datatype variable = new datatype[size]
        String[] colors = new String[6];
        System.out.println("Enter six colors");
        for (int i = 0; i < colors.length; i++) {

            System.out.print("Enter color: [" + (i + 1) + "]: ");
            colors[i] = scanner.nextLine();
        }

        for (String color : colors) {
            System.out.println(color);
        }




    }
}
