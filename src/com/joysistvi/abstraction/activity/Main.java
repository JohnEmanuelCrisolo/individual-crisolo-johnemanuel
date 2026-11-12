
package com.joysistvi.abstraction.activity;


public class Main {
    public static void main(String[] args) {
        String penBrand = "Pilot";
        String penColor = "Black";
        double penWeight = 15.5;

        System.out.println("=== Calling methods on Pen references ===");

        Pen pen = new Pen(penBrand, penColor, penWeight);
        System.out.println("--- Pen ---");
        pen.write();
        pen.refill();


        String ballpenBrand = "Pilot";
        String ballpenColor = "Blue";
        double pointSize = 0.5;
        double ballpenWeight = 12.5;


        Pen pen2 = new Ballpen(ballpenBrand, ballpenColor, pointSize, ballpenWeight);
        System.out.println("\n--- Ballpen ---");

        pen2.write();
        pen2.refill();

        String markerBrand = "Sharpie";
        String markerColor = "Red";
        double markerWeight = 20.5;
        boolean permanent = true;

        Pen pen3 = new Marker(markerBrand, markerColor, markerWeight, permanent);

        System.out.println("\n--- Marker ---");

        pen3.write();
        pen3.refill();

        System.out.println("\n===== Pen details =====\n");
        System.out.println(pen);
        pen.write();
        pen.refill();
        System.out.println("\n===== Ballpen details =====\n");
        System.out.println(pen2);
        pen2.write();
        pen2.refill();
        System.out.println("\n===== Marker details =====\n");
        System.out.println(pen3);
        pen3.write();
        pen3.refill();

        System.out.println("\n====== TEST PEN ======");

        System.out.println("\n--- Testing Ballpen ---");
        testPen(pen2);


        System.out.println("\n========== METHOD OVERLOADING ==========");
        System.out.println("\n--- Ballpen Overloaded Methods ---");
        System.out.println("--- Hello 1x ---");
        pen2.write("Hello!");

        System.out.println("--- Hello 3x ---");
        pen2.write("Ball pen writes Hello!", 3);


    }

    public static void testPen(Pen pen2) {

        System.out.println(pen2);
        pen2.write();
        pen2.refill();

    }
}
