
package com.joysistvi.day18.methods;

import java.util.Scanner;

public class LoadRegistration {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssdCode();

    }

    public static void dialUssdCode() {

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        // guard clause / early exit
        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code!");
            return;
        }

        promptMainMenu();
    }

    public static void promptMainMenu() {

        while (true) {

            System.out.println();
            System.out.println("        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ");

            switch(mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 0 -> {
                 exitMethod();
                 return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void goPlusPromo(){

        while (true) {

            System.out.println("        *** Go+ Promos ***");
            System.out.println("    [1] Go+99");
            System.out.println("    [2] Go+129");
            System.out.println("    [3] Go+149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goPlusChoice = getInput("Enter a choice: ");

            switch (goPlusChoice) {
                case 1 -> promoDetailsMenu("Go+99", 8, 8);
                case 2 -> promoDetailsMenu("Go+129", 16, 16);
                case 3 -> promoDetailsMenu("Go+149", 32, 32);
                case 4 -> { return; }
                case 0 -> {
                    exitMethod();
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void goPromo() {

        while (true) {

            System.out.println();
            System.out.println("        *** Go Promos ***");
            System.out.println("    [1] Go50");
            System.out.println("    [2] Go90");
            System.out.println("    [3] Go120");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goChoice = getInput("Enter a choice: ");

            switch (goChoice) {
                case 1 -> promoDetailsMenu("Go50", 5, 3);
                case 2 -> promoDetailsMenu("Go90", 8, 5);
                case 3 -> promoDetailsMenu("Go120", 12, 8);
                case 4 -> { return; }
                case 0 -> {
                    exitMethod();
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void goExtraPromo() {

        while (true) {

            System.out.println();
            System.out.println("        *** GoEXTRA Promos ***");
            System.out.println("    [1] GoEXTRA99");
            System.out.println("    [2] GoEXTRA129");
            System.out.println("    [3] GoEXTRA149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goExtraChoice = getInput("Enter a choice: ");

            switch (goExtraChoice) {
                case 1 -> promoDetailsMenu("GoEXTRA99", 8, 8);
                case 2 -> promoDetailsMenu("GoEXTRA129", 8, 8);
                case 3 -> promoDetailsMenu("GoEXTRA149", 8, 8);
                case 4 -> { return; }
                case 0 -> {
                    exitMethod();
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void unli5GPromo() {

        while (true) {

            System.out.println();
            System.out.println("        *** UNLI 5G Promos ***");
            System.out.println("    [1] UNLI 5G 99");
            System.out.println("    [2] UNLI 5G 149");
            System.out.println("    [3] UNLI 5G 199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int unli5GChoice = getInput("Enter a choice: ");

            switch (unli5GChoice) {
                case 1 -> promoDetailsMenu("UNLI 5G 99", 8, 8);
                case 2 -> promoDetailsMenu("UNLI 5G 149", 8, 8);
                case 3 -> promoDetailsMenu("UNLI 5G 199", 8, 8);
                case 4 -> { return; }
                case 0 -> {
                    exitMethod();
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void allNetPromo() {

        while (true) {

            System.out.println();
            System.out.println("        *** ALLNET Promos ***");
            System.out.println("    [1] ALLNET 99");
            System.out.println("    [2] ALLNET 149");
            System.out.println("    [3] ALLNET 199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int allNetChoice = getInput("Enter a choice: ");

            switch (allNetChoice) {
                case 1 -> promoDetailsMenu("ALLNET 99", 8, 8);
                case 2 -> promoDetailsMenu("ALLNET 149", 8, 8);
                case 3 -> promoDetailsMenu("ALLNET 199", 8, 8);
                case 4 -> { return; }
                case 0 -> {
                    exitMethod();
                    return;


                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void promoDetailsMenu(String promoName, int gb, int freeGB) {

        while (true) {

            System.out.println();
            System.out.println("        *** " + promoName + " Promo ***");
            System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Back");
            System.out.println("    [0] Exit");

            int actionChoice = getInput("Enter a choice: ");

            switch (actionChoice) {
                case 1 -> {
                    System.out.print("You are now subscribed to " + promoName + "!");
                    break;
                }
                case 2 -> { return; }
                case 0 -> {
                    exitMethod();
                    return;

                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    public static void exitMethod() {

        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.print("\nEnter your choice: ");
        String choice = scanner.nextLine().trim();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
            System.exit(0);
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Returning Back to Main Menu");
            return;
        } else {
            System.out.println("Invalid Choice. Returning Back to Main Menu");
            return;
        }
    }

    public static int getInput(String prompt) {

        while (true) {

            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }

}
