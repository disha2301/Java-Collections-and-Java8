package com.gevernova.javaeight.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        // List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Cat", "Dog"),
                Arrays.asList("Elephant", "Frog")
        );

        // Using flatMap to flatten into a single list
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened List: " + flattenedList);
    }
}