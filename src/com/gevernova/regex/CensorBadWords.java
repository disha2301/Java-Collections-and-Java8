package com.gevernova.regex;

import java.util.Arrays;
import java.util.List;

public class CensorBadWords {
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");

        for (String badWord : badWords) {
            // Replace all occurrences of the bad word with "****"
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println(sentence);
    }
}