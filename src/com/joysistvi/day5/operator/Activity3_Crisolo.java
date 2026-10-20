package com.joysistvi.day5.operator;

public class Activity3_Crisolo {

    public static void main(String[] args) {
        // Using the logical AND operator (&&), determine if the person is allowed to enter an event.

        int age = 19;
        boolean hasValidId = true;
        boolean isAllowedToEnter = age > 17 && hasValidId;

        //  Using the logical OR operator (||), determine if there are no classes today. (Weekend/Holiday)

        boolean isHoliday = true;
        boolean isWeekend = false;
        String status = (isHoliday || isWeekend) ? "There are classes" : "There are no classes";

        //  Use the ternary operator (? :) to determine if the student passed or failed.

        int score = 75;
        String result = (score > 74) ? "Passed" : "Failed";

        //  Use the ternary operator (? :) to determine the larger number.

        int num = 10;
        int num2 = 20;
        int largerNumber = (num > num2) ? num : num2;

        // result
        System.out.println("Allowed to enter: " + isAllowedToEnter);
        System.out.println("Is there classes today: " + status);
        System.out.println("Result: " + result);
        System.out.println("Larger number: " + largerNumber);



    }


}
