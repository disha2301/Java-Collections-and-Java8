package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // Regex to match email addresses
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted email addresses:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No email addresses found.");
        }

        scanner.close();
    }
}
