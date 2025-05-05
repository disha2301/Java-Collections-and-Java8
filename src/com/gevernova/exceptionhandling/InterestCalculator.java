package com.gevernova.exceptionhandling;

public class InterestCalculator {

    // Calculates simple interest and throws exception for invalid input
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate cannot be in negative");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            double interest = calculateInterest(5000, 2.5, 5);
            System.out.println("Calculated Interest is: " + interest);

            // This call will throw an exception
            double invalidInterest = calculateInterest(4000, -85, 5);
            System.out.println("Calculated Interest is not printed: " + invalidInterest);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program has ended.");
        }
    }
}
