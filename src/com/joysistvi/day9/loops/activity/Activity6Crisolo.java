import java.util.Scanner;

public class Activity6Crisolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want to display: ");
        int num = scanner.nextInt();

        if (num > 10 || num < 1) {
            System.out.println("Invalid number please choose a number from 1-10");
            scanner.close();
            return;
        }

        System.out.println("\n *** Multiplication table of " + num + " ***");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }


    }
}