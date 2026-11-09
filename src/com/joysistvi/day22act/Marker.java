package com.joysistvi.day22act;

public class Marker extends Pen {
    private boolean permanent;

    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public void write() {
        System.out.println("Writing with a marker.");
    }

    @Override
    public String toString() {
        return "Type: Marker\n" + super.toString()
                + "\nPermanent: " + permanent;
    }
}
