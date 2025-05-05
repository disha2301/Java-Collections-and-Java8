package com.gevernova.exceptionhandling.agevalidation;

import java.util.Scanner;

public class AgeValidation {

    public void validateAge(int age) {
        if (age < 18) {
            // Throwing custom unchecked exception if age is below 18
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is approved");
    }

    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting user to enter age
            System.out.println("Enter your age : ");
            int age = scanner.nextInt();

            // Creating object to call non-static method
            AgeValidation obj = new AgeValidation();

            // Validating the entered age
            obj.validateAge(age);

        } catch (InvalidAgeException e) {
            // Handling custom exception if age is invalid
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handling any other unexpected input (like characters)
            System.out.println(e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Program ended");
        }
    }
}
