package com.joysistvi.day15.oopintro;

public class Main {
    public static void main(String[] args) {

        Laptop lappy = new Laptop();
        lappy.brand = "MSI";
        lappy.color = "Black";
        lappy.weightInKg = 1.5;
        lappy.cpu = "i5";
        lappy.ramInGb = 16;

        lappy.browseInternet();
        lappy.transferFile();
        lappy.sendMessages();
        lappy.createDocuments();

        Laptop lappy2 = new Laptop();
        lappy.brand = "Lenovo";
        lappy.color = "Black";
        lappy.weightInKg = 0.95;
        lappy.cpu = "i7";
        lappy.ramInGb = 32;

        lappy.transferFile();
        lappy.sendMessages();
        lappy.createDocuments();

        Laptop lappy3 = new Laptop();

        lappy.brand = "HP";
        lappy.color = "Black";
        lappy.weightInKg = 0.80;
        lappy.cpu = "i5";
        lappy.ramInGb = 8;

        lappy.transferFile();
        lappy.sendMessages();
        lappy.createDocuments();

    }
}
