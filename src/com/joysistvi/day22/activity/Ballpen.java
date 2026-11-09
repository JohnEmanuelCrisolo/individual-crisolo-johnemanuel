package com.joysistvi.day22.activity;

public class Ballpen extends Pen {
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
}
