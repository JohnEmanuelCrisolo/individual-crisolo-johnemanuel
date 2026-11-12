
package com.joysistvi.abstraction.activity;

public class Main {
    public static void main(String[] args) {

        String ballpenBrand = "Pilot";
        String ballpenColor = "Blue";
        double pointSize = 0.5;
        double ballpenWeight = 12.5;

        Ballpen ballpen = new Ballpen(ballpenBrand, ballpenColor, pointSize, ballpenWeight);

        String markerBrand = "Sharpie";
        String markerColor = "Red";
        double markerWeight = 20.5;
        boolean permanent = true;

        Marker marker = new Marker(markerBrand, markerColor, markerWeight, permanent);

        System.out.println("=== Calling methods on Pen references ===");

        System.out.println("\n--- Ballpen ---");
        ballpen.write();

        System.out.println("\n--- Marker ---");
        marker.write();

        System.out.println("\n===== Ballpen details =====\n");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n===== Marker details =====\n");
        System.out.println(marker);
        marker.write();

        System.out.println("\n====== TEST REFILLABLE ======");

        System.out.println("\n--- Testing Ballpen ---");
        testRefillable(ballpen);
        testPen(ballpen);


        System.out.println("\n--- Testing Marker ---");
        testRefillable(marker);
        testPen(marker);


        System.out.println("\n====== TEST CLICKABLE ======");

        System.out.println("\n--- Testing Ballpen ---");
        ballpen.click();



        System.out.println("\n========== METHOD OVERLOADING ==========");

        System.out.println("\n--- Ballpen Overloaded Methods ---\n");

        System.out.println("--- Hello 1x ---");
        ballpen.write("Hello!");

        System.out.println("--- Hello 3x ---");
        ballpen.write("Hello!", 3);

    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();

    }

    public static void testRefillable(Refillable refillable) {

        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);

    }

    public static void testClickable(Clickable clickable) {

        clickable.click();

    }

//  ==== PART 4 Remove any new Pen(...). Before you remove it, try running it and read the error message.
//              Then write a comment in Main that explains why it fails.
    /*
    Pen is abstract so it cannot be instantiated.
    Abstract classes cannot be used to create objects directly so 
     Instead, we must create objects using its child classes,
    */

    // PART 5 At the bottom of Main.java, write a comment (3 to 5 lines) that explains the difference between

    /*
    Abstract class can be inherited by using extends it does not control how the child class would do it and it does not
    limit if the child want to add to it
    but interface implement is something that you require a class to have, you can think of it as an activity that you hand down
    to a student, you simply gave them structure but it is their own choice of answer or input.
     */
}
