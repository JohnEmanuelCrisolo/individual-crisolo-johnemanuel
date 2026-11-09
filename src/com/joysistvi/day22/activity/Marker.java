package com.joysistvi.day22.activity;

public class Marker extends Pen {
    private boolean permanent;


    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);

    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }


    @Override
    public String toString() {
        return "Marker details\nType: Marker\n" + super.toString()
                + "\nPermanent: " + (permanent ? "Yes" : "No");
    }
}
