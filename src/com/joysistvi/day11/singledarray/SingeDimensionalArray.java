package com.joysistvi.day11.singledarray;

public class SingeDimensionalArray {
    public static void main (String [] args) {
        // Syntax
        // 67 , 21 , 50, 20, 43 (age)
        // indices:      0   1   2   3   4
        int [] ages   = { 61, 21, 50, 20, 43};

        // invoke element
        System.out.println(ages [0]);
        // length of array
        System.out.println(ages.length);
        // Traverse an array using for loop
        /*for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }*/
        // for-each loop
        for (int age : ages) {
            System.out.println(age);
        }




    }
}
