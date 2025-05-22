package com.gevernova.javaeight.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Disha","Rashi","Sakshi","Arushi","Shreya");
        // Group words by their first letter
        Map<Character, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        // display the grouped works
        for(Map.Entry<Character, List<String>> entry: groupedWords.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
