package com.joysistvi.day15.oopintro.miniactivity;

public class Main {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();

        cellphone.brand = "Samsung";
        cellphone.model = "Galaxy S24";
        cellphone.color = "Black";
        cellphone.storageInGb = 256;
        cellphone.ramInGb = 16;

        cellphone.makeCall();
        cellphone.sendMessage();
        cellphone.takePhoto();
        cellphone.playMusic();
        cellphone.browseInternet();


        Cellphone cellphone2 = new Cellphone();

        cellphone2.brand = "Apple";
        cellphone2.model = "iPhone 16";
        cellphone2.color = "White";
        cellphone2.storageInGb = 128;
        cellphone2.ramInGb = 16;


        cellphone2.sendMessage();
        cellphone2.takePhoto();
        cellphone2.playMusic();
        cellphone2.browseInternet();

        Cellphone cellphone3 = new Cellphone();

        cellphone2.brand = "Asus";
        cellphone2.model = "ROG Phantom X";
        cellphone2.color = "Black";
        cellphone2.storageInGb = 512;
        cellphone2.ramInGb = 24;

        cellphone2.makeCall();
        cellphone2.sendMessage();
        cellphone2.playMusic();
        cellphone2.browseInternet();

    }
}