
package com.joysistvi.day13.string;

public class Activity10Crisolo {
    public static void main(String[] args) {
        String country = "Philippines";

        // 1. contains() - Checks if a string contains a specific word or sequence of characters. Returns true if found, otherwise false.
        System.out.println("Contains pin: " + country.contains("pin"));

        // 2. endsWith() - Checks if a string ends with a specific word or sequence of characters.
        System.out.println("Ends with nes: " + country.endsWith("nes"));

        // 3. startsWith() - Checks if a string begins with a specific word or sequence of characters.
        System.out.println("Starts with Phil: " + country.startsWith("Phil"));

        // 4. indexOf() - It finds the position of the first occurence of a char or text
        System.out.println("Index of i: " + country.indexOf("i"));

        // 5. trim() - Removes spaces in the beginning and end of a string
        String countryWithSpace = "   Philippines   ";
        System.out.println("Trim: " + countryWithSpace.trim());

        // 6. replace() - Change specified char with something else
        System.out.println("Replace p with b: " + country.replace("p", "b"));

        // 7. toCharArray() - Converts a string into an array of individual characters so they can be accessed separately.
        char[] letters = country.toCharArray();
        System.out.print("Characters: ");
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();


        // Display first and last character

        System.out.println("First letter: " + country.charAt(0)); // First letter
        System.out.println("Last letter: " + country.charAt(10)); // Last letter


        // Count and display how many times the character "P/p" appears in the string.
        char target = 'p';
        char target2 = 'P';
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        int count = 0;
        int count2 = 0;
        char[] finders = country.toCharArray();
        boolean comma = true;

        System.out.print("P/p: ");

        for (char finder : finders) {

            if (finder == target || finder == target2) {
                if (!comma) {
                    System.out.print(", ");
                }

                System.out.print(finder);
                comma = false;
                count++;
            }

        }
        System.out.println("\nP/p count: " + count);

        System.out.print("Vowels: ");
        boolean first = true;

        for (char finder : finders) {
            for (char vowels : vowel) {

                if (finder == vowels) {
                    if (!first) {
                        System.out.print(", ");
                    }

                    System.out.print(finder);
                    first = false;
                    count2++;
                    break;
                }
            }
        }

        System.out.println("\nVowel count: " + count2);
    }
}
