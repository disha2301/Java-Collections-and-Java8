package com.gevernova.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Take input from the user
            System.out.print("Enter first number: ");
            int numOne = scanner.nextInt();

            System.out.print("Enter second number: ");
            int numTwo = scanner.nextInt();

            // Perform division
            int divisionResults = numOne / numTwo;
            System.out.println(numOne + " divided by " + numTwo + " is " + divisionResults);

        } catch (ArithmeticException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Always executed
            System.out.println("Execution completed");
        }
    }
}
