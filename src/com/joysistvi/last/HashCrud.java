package com.joysistvi.last;

import java.util.HashSet;
import java.util.Random;

public class HashCrud {

    public static void main(String[] args) {

        // System.out.println(lottoNumbers);

        HashSet<Integer> bingoNumbers = new HashSet<>();
        Random random = new Random();

        String letter;
        int roll = random.nextInt(75);

        if (roll < 16) {
            letter = "B";
        } else if (roll < 31) {
            letter = "I";
        } else if (roll < 46) {
            letter = "N";
        } else if (roll < 61) {
            letter = "G";
        } else {
            letter = "O";
        }

        System.out.println("Sa letra ng " + letter + " : " + roll);

    }
}