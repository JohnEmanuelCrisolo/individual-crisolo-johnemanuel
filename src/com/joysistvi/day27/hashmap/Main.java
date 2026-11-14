package com.joysistvi.day27.hashmap;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "John", "Makati", "09668370760"));
        employeeList.add(new Employee(101, "John", "Makati", "09668370760"));
        employeeList.add(new Employee(101, "John", "Makati", "09668370760"));

        employeeList.forEach(System.out :: println);

    }
}
