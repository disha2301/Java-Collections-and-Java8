package com.gevernova.javaeight.streamapi.employeemanagement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexStreamOperations {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000),
                new Employee("Bob", 45000),
                new Employee("Charlie", 75000),
                new Employee("David", 30000),
                new Employee("Eve", 80000)
        );

        // step-by-step stream operations
        List<String> highSalaryEmployeeName = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Employees with salary > 50000 (sorted): " + highSalaryEmployeeName);
    }
}
