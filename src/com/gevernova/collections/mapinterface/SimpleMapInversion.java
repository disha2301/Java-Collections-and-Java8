package com.gevernova.collections.mapinterface;
import java.util.*;


public class SimpleMapInversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> originalMap = new HashMap<>();

        System.out.print("How many entries? ");
        int num = scanner.nextInt();
        scanner.nextLine(); // clear newline

        // Taking input for the original map
        for (int i = 0; i < num; i++) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();

            System.out.print("Enter value: ");
            String value = scanner.nextLine();

            originalMap.put(key, value);
        }

        // Invert the map
        Map<String, List<String>> invertedMap = new HashMap<>();

        for (String key : originalMap.keySet()) {
            String value = originalMap.get(key);

            // If value not in inverted map, make new list
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            // Add the key to that list
            invertedMap.get(value).add(key);
        }

        // Show result
        System.out.println("\nInverted Map:");
        for (String val : invertedMap.keySet()) {
            System.out.println(val + " -> " + invertedMap.get(val));
        }
    }
}
