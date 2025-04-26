package com.gevernova.regex;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex to find repeated consecutive words (case-insensitive)
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Use a set to avoid duplicate outputs
        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        for (String word : repeatedWords) {
            System.out.println(word);
        }
    }
}
