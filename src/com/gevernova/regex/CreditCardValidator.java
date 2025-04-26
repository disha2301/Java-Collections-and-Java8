package com.gevernova.regex;

import java.util.regex.Pattern;

public class CreditCardValidator {
    public static boolean isValidCard(String cardNumber) {
        String regex = "^(4\\d{15}|5\\d{15})$";
        return Pattern.matches(regex, cardNumber);
    }

    public static void main(String[] args) {
        System.out.println(isValidCard("4123456789012345")); // true (Visa)
        System.out.println(isValidCard("5123456789012345")); // true (MasterCard)
        System.out.println(isValidCard("6123456789012345")); // false (Invalid start)
        System.out.println(isValidCard("412345678901234"));  // false (15 digits only)
    }
}