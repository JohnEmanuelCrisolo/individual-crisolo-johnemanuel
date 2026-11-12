package com.joysistvi.abstraction.activity;

public class Ballpen extends Pen implements Refillable, Clickable {
    private double pointSize;

    public Ballpen(String brand, String color, double pointSize, double weightInGrams) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing with a ballpen...");
    }

    @Override
    public String toString() {
        return "Type: Ballpen\n" + super.toString()
                + "\nPoint Size: " + pointSize;
    }
    @Override
    public void refill(){
        System.out.println("Refilling ballpen...");
    }

    @Override
    public void click() {

        System.out.println("Click! The ballpen tip comes out.");

    }
}
