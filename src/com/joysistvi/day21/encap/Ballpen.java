package com.joysistvi.day21.encap;

public class Ballpen {

    //Data hiding
    private String brand;
    private String color;
    private double pointSize;
    private double weightInGrams;

    public Ballpen(String brand, String color, double pointSize, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.pointSize = pointSize;
        this.weightInGrams = weightInGrams;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPointSize() {
        return pointSize;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }



    public void setBrand(String brand) {
        this.brand = brand;

    }


    public void setColor(String color) {
        this.color = color;
    }




    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }


    // String representation of object
    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Color: " + color  + "\n" +
                "Point Size: " + pointSize + "\n" +
                "Weight in Grams: " + weightInGrams;

    }
}
