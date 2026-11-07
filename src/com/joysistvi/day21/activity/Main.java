
package com.joysistvi.day21.activity;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("======== User Account Registration =========");

        System.out.print("\nEnter your firstname: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middlename: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your lastname: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        String email = "";

        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();

            if (email.contains("@") && email.contains(".com") && email.lastIndexOf('@') < email.lastIndexOf(".com")) {
                break;
            }
            else {
                System.out.println("Please enter a valid email address.");
            }
        }

        // Password Validation

        String password = "";
        UserAccount useraccount = new UserAccount(firstName, middleName, lastName, address, email, password);
        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            boolean hasNumber = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasNumber = true;
                    break;
                }
            }

            if (password.length() >= 8 && hasNumber) {
                break;
            } else {
                System.out.println("Password must have a number and more than 8 characters");
            }
        }



        String passwordHide = "*";



        System.out.println("\n======== Registration Details =========");

        System.out.println(useraccount);
        System.out.print("Password: ");
        for (int i = 0; i < password.length(); i++){
            System.out.print("*");
        }

        System.out.print("\n----- Account Registration Complete! -----");

    }

}
