package com.joysistvi.day7.activity;
import java.util.Scanner;
public class Activity5 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to access Globe Services");

        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();

        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code please try again");
            scanner.close();
            return;
        }

        System.out.println("Access verified...");



        System.out.println("\n        * Load Registration *");
        System.out.println("[1] Go+");
        System.out.println("[2] Go");
        System.out.println("[3] GoEXTRA");
        System.out.println("[4] UNLI 5G");
        System.out.print("[5] ALLNET");

        System.out.print(" Enter a choice: ");
        int choice = scanner.nextInt();


        String menu;

        switch (choice) {
            case 1:
                menu = "Go+";
                break;
            case 2:
                menu = "Go";
                break;
            case 3:
                menu = "GoEXTRA";
                break;
            case 4:
                menu = "UNLI 5G";
                break;
            case 5:
                menu = "ALLNET";
                break;
            default:
                System.out.println("Invalid Choice");
                scanner.close();
                return;
        }

        switch (menu) {
            case "Go+":
                System.out.println("\n       Go+ promos");
                System.out.println("\n[1] Go+99");
                System.out.println("[2] Go+129");
                System.out.println("[3] Go+149");

                break;

            case "Go":
                System.out.println("\n       Go promos");
                System.out.println("[1] Go50");
                System.out.println("[2] Go90");
                System.out.println("[2] Go120");
                break;

            case "GoEXTRA":
                System.out.println("\n       GoEXTRA promos");
                System.out.println("[1] GoEXTRA99");
                System.out.println("[2] GoEXTRA129");
                System.out.println("[2] GoEXTRA149");
                break;

            case "UNLI 5G":
                System.out.println("\n       UNLI 5G promos");
                System.out.println("[1] UNLI 5G 99");
                System.out.println("[2] UNLI 5G 149");
                System.out.println("[2] UNLI 5G 199");
                break;

            case "ALLNET":
                System.out.println("\n       ALLNET promos");
                System.out.println("[1] ALLNET 99");
                System.out.println("[2] ALLNET 149");
                System.out.println("[3] ALLNET 199");
                break;
        }

        System.out.print("Enter a  choice: ");
        int promoChoice = scanner.nextInt();

        String promo = "";

        switch (menu) {

            case "Go+":
                switch (promoChoice) {
                    case 1:
                        promo = "Go+99 Promo";
                        break;
                    case 2:
                        promo = "Go+129 Promo";
                        break;
                    case 3:
                        promo = "Go+149 Promo";
                        break;
                    default:
                        System.out.println("Invalid Promo Choice");
                        scanner.close();
                        return;
                }
                break;
            case "Go":
                switch (promoChoice) {
                    case 1:
                        promo = "Go50 Promo";
                        break;
                    case 2:
                        promo = "Go90 Promo";
                        break;
                    case 3:
                        promo = "Go120 Promo";
                        break;
                    default:
                        System.out.println("Invalid Promo Choice");
                        scanner.close();
                        return;
                }
                break;

            case "GoEXTRA":
                switch (promoChoice) {
                    case 1:
                        promo = "GoEXTRA99 Promo";
                        break;
                    case 2:
                        promo = "GoEXTRA129 Promo";
                        break;
                    case 3:
                        promo = "GoEXTRA149 Promo";
                        break;
                    default:
                        System.out.println("Invalid Promo Choice");
                        scanner.close();
                        return;
                }
                break;

            case "UNLI 5G":
                switch (promoChoice) {
                    case 1:
                        promo = "UNLI 5G 99 Promo";
                        break;
                    case 2:
                        promo = "UNLI 5G 149 Promo";
                        break;
                    case 3:
                        promo = "UNLI 5G 199 Promo";
                        break;
                    default:
                        System.out.println("Invalid Promo Choice");
                        scanner.close();
                        return;
                }
                break;

            case "ALLNET":
                switch (promoChoice) {
                    case 1:
                        promo = "ALLNET 99 Promo";
                        break;
                    case 2:
                        promo = "ALLNET 149 Promo";
                        break;
                    case 3:
                        promo = "ALLNET 199 Promo";
                        break;
                    default:
                        System.out.println("Invalid Promo Choice");
                        scanner.close();
                        return;
                }
                break;

        }

        System.out.println("\n      *** " + promo  + " ***");
        System.out.println("-> Get 8 GB for all sites + 8GB");
        System.out.println("[1] Subscribe");
        System.out.println("[2] Exit");
        System.out.print("Enter a choice:");
        int subscription = scanner.nextInt();

        switch (subscription) {
            case 1:
                System.out.println("You are now subscribed to " + promo);
                scanner.close();
                break;
            default: System.out.println("Exited program");
                scanner.close();
                return; }





    }
}
