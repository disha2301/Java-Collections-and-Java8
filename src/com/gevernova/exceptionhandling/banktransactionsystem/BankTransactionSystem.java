package com.gevernova.exceptionhandling.banktransactionsystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);  // Initial balance

        try {
            account.withdraw(200);   // Valid withdrawal
            account.withdraw(-50);   // Invalid amount
            account.withdraw(900);   // Insufficient funds
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
