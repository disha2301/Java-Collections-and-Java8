package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // License plate must have two uppercase letters followed by four digits
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
        System.out.print("Enter License Plate Number: ");
        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is a valid license plate number.");
        } else {
            System.out.println(input + " is NOT a valid license plate number.");
        }
    }
}
