package com.joysistvi.day4.operator;

public class UnaryOperator {
    public static void main (String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        double totalExpense = foodAllowance + transportation + rent + utilityBill;

        // 3. Calculate the percentage of each expense relative to the total income.
        System.out.printf("Food allowance percentage relative to income: %.1f%%\n", foodAllowance / income * 100);
        System.out.printf("Transportation percentage relative to income: %.1f%%\n", transportation / income * 100);
        System.out.printf("Rent percentage relative to income: %.1f%%\n", rent / income * 100);
        System.out.printf("Utility bill percentage relative to income: %.1f%%\n", utilityBill / income * 100);
        // 4. Calculate and display the remaining balance after deducting all the expenses from the income.
        System.out.println("Remaining balance after expenses: " + (income - totalExpense));

    }
}
