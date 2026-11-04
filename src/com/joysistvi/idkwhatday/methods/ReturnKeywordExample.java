package com.joysistvi.idkwhatday.methods;

public class ReturnKeywordExample {

    public static void main(String[] args) {
        String fullName = createFullName("John Emanuel H.", "Crisolo");
        System.out.println("Full Name: " + fullName);
        System.out.println(createGreeting("John Emanuel H. Crisolo"));
    }

    public static String createGreeting(String name) {
        return "Hello, " + name + "! Welcome to Java!";
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}