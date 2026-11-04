package com.joysistvi.day18.methods;

public class JavaMethod {


    public static void main(String[] args) {
        int year = 2026;
        if (year == 2026) {
            greet("me", 20);
        } else if (year == 2027) {
            greet("me", 21);

        }

    }

    public static void greet(String name, int age) {
        print("Hello " + name);
        print("I am " + age + " years old");

    }

    public static void print(String word) {
        System.out.println(word);
    }

//    public static void main(String[] args) {
//        System.out.println(sum(5, 10));
//    }
//
//    public static int sum (int a, int b) {
//        return a + b;
//    }
}
