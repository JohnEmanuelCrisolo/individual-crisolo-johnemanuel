package com.joysistvi.day26.collectionsframework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkListCrud {

    public static void main() {

        List<String> dice = new LinkedList<>();
        System.out.println("*** Color Game ***");
        // Create / Add item(s)
        dice.add("Blue");
        dice.add("Green");
        dice.add("Pink");
        dice.add("White");
        dice.add("Red");
        dice.add("Yellow");

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(dice);
            System.out.println((i + 1) + ". " + dice.get(0));
        }
    }
}
