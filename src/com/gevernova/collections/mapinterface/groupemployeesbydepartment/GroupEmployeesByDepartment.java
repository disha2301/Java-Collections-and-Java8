package com.gevernova.collections.mapinterface.groupemployeesbydepartment;

import java.util.*;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // clear newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter department: ");
            String dept = scanner.nextLine();

            employees.add(new Employee(name, dept));
        }

        // Grouping employees by department
        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {
            if (!grouped.containsKey(emp.department)) {
                grouped.put(emp.department, new ArrayList<>());
            }
            grouped.get(emp.department).add(emp);
        }

        // Display the groups
        System.out.println("\nEmployees grouped by department:");
        for (String dept : grouped.keySet()) {
            System.out.println(dept + ": " + grouped.get(dept));
        }
    }
}
