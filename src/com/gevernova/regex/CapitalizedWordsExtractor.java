package com.gevernova.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Regex to match words starting with uppercase followed by lowercase letters
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.print("Capitalized words: ");
        while (matcher.find()) {
            System.out.print(matcher.group());
            System.out.print(", ");
        }
    }
}
