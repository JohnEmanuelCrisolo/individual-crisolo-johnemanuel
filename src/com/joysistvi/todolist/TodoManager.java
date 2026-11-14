
package com.joysistvi.todolist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("===== Todo List =====\n");

        System.out.println("Choose an action:\n");
        int choice;

        do {
            showMenu();
            choice = getInput("\nEnter your choice: ");

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:
                    clearTasks();
                    break;

                case 0:
                    System.out.println("Exiting Todo Manager...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();

        } while (choice != 0);

    }

    // Keeps asking until the user enters a valid integer
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. Add a task\n" +
                "2. View all tasks\n" +
                "3. Update a task\n" +
                "4. Remove a task\n" +
                "5. Clear all tasks\n" +
                "0. Exit");
    }

    public static void addTask() {

        System.out.print("Enter a task: ");
        String addtask = scanner.nextLine();

        tasks.add(addtask);

        System.out.println("Task added successfully!");

    }

    public static void viewTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

    }

    public static void updateTask() {

        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        int taskNumber = getInput("Enter the task number you want to update: ");

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {

            System.out.print("Enter the new task: ");
            String newTask = scanner.nextLine();

            tasks.set(taskNumber - 1, newTask);

            System.out.println("Task updated successfully!");

        } else {
            System.out.println("Invalid task number.");
        }

    }

    public static void removeTask() {

        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        int taskNumber = getInput("Enter the task number you want to remove: ");

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {

            tasks.remove(taskNumber - 1);

            System.out.println("Task removed successfully!");

        } else {
            System.out.println("Invalid task number.");
        }

    }

    public static void clearTasks() {

        tasks.clear();
        System.out.println("Clearing all tasks...\n");
        System.out.println("All tasks cleared successfully!");

    }
}
