package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regex pattern: # followed by 6 hex characters
        Pattern pattern = Pattern.compile("^#[0-9a-fA-F]{6}$");

        System.out.print("Enter Hex Color Code: ");
        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is a valid Hex Color Code.");
        } else {
            System.out.println(input + " is NOT a valid Hex Color Code.");
        }
    }
}
