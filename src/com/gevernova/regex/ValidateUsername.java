package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args){
        // Create Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Regular expression for a valid username:
        // - Only letters (both uppercase and lowercase), digits, and underscores allowed
        // - Length between 4 and 15 characters
        String regex = "^[a-zA-Z0-9_]{4,15}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Prompt the user to enter a username
        System.out.print("Enter the username : ");
        String username = scanner.nextLine();

        // Match the input username against the regex pattern
        Matcher matcher = pattern.matcher(username);

        // Check if the username matches the pattern
        if (matcher.matches()) {
            System.out.println(username + "' is a valid username.");
        } else {
            System.out.println(username + " is NOT a valid username.");
        }
    }
}
