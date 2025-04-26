package com.gevernova.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        // Sample text containing URLs to extract
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regular expression pattern to match URLs starting with http or https
        String regex = "https?://[^\\s]+";

        // Compile the regex into a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to find matches in the input text
        Matcher matcher = pattern.matcher(text);

        // Iterate over all matches and print each matched URL
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
