package com.gevernova.collections.mapinterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String str = scanner.nextLine();

        // HashMap to store the word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Split the sentence into words
        String[] words = str.split(" ");

        // Count each word
        for(String word : words){
            // Convert word to lowercase
            word = word.toLowerCase();

            // Manually remove non-alphabetical characters
            StringBuilder cleanword = new StringBuilder();
            for(char ch : word.toCharArray()){
                if(Character.isLetter(ch)){
                    cleanword.append(ch);
                }
            }

            // Cleaned word after removing non-alphabetic characters
            word = cleanword.toString();

            // If the word is not empty, process it
            if (!word.isEmpty()) {
                // Check if the word is already in the map
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1); // Increment count
                } else {
                    wordCount.put(word, 1); // Initialize count to 1
                }
            }
        }

        // Output the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
