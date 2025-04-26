package com.gevernova.javaeight.streamapi.employeemanagement;

public class Employee {
    private String name;
    private double salary;

    // constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    //getter method
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}

