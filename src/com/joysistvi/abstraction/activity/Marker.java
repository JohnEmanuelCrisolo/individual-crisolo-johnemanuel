
package com.joysistvi.abstraction.activity;

public class Marker extends Pen implements Refillable, Clickable {
    private boolean permanent;

    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public String toString() {
        return "Marker details\nType: Marker\n" + super.toString()
                + "\nPermanent: " + (permanent ? "Yes" : "No");
    }

    @Override
    public void write(){
        System.out.println("Writing with a marker...");
    }

    @Override
    public void refill() {
        System.out.println("Refilling marker...");
    }

    @Override
    public void click() {

    }
}
