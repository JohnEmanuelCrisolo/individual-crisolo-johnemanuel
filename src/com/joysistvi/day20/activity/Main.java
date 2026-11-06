package com.joysistvi.day20.activity;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        UserAccount useraccount = new UserAccount();

        System.out.println("======== User Account Registration =========");

        System.out.print("\nEnter your firstname: ");
        useraccount.setFirstName(scanner.nextLine());

        System.out.print("Enter your middlename: ");
        useraccount.setMiddleName(scanner.nextLine());

        System.out.print("Enter your lastname: ");
        useraccount.setLastName(scanner.nextLine());

        System.out.print("Enter your address: ");
        useraccount.setAddress(scanner.nextLine());

        while (true) {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            if (email.contains("@") && email.contains(".com") && email.lastIndexOf('@') < email.lastIndexOf(".com")) {
                useraccount.setEmail(email);
                break;
            }
            else {

                System.out.println("Please enter a valid email address.");

            }

        }

        // Password Validation
        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            boolean hasNumber = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasNumber = true;
                    break;
                }
            }

            if (password.length() >= 8 && hasNumber) {
                useraccount.setPassword(password);
                break;
            } else {
                System.out.println("Password must be at least 8 characters long and contain at least one number!");
            }
        }

        String passwordHide = "";

        for (int i = 0; i < useraccount.getPassword().length(); i++) {
            passwordHide += "*";
        }

        System.out.println("\n======== Registration Details =========");

        System.out.println("First Name: " + useraccount.getFirstName());
        System.out.println("Middle Name: " + useraccount.getMiddleName());
        System.out.println("Last Name: " + useraccount.getLastName());
        System.out.println("Address: " + useraccount.getAddress());
        System.out.println("Password: " + passwordHide);
        System.out.println("Email: " + useraccount.getEmail());

        System.out.println("\n Account Registration Complete!");

    }

}