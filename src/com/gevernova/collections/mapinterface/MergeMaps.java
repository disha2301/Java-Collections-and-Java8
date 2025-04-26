package com.gevernova.collections.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapOne = new HashMap<>();
        Map<String, Integer> mapTwo = new HashMap<>();

        System.out.print("How many entries in Map1? ");
        int numOne = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOne; i++) {
            System.out.print("Enter key for Map1: ");
            String key = scanner.nextLine();
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            mapOne.put(key, value);
        }

        System.out.print("How many entries in Map2? ");
        int numTwo = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTwo; i++) {
            System.out.print("Enter key for Map2: ");
            String key = scanner.nextLine();
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            mapTwo.put(key, value);
        }

        // Merging map2 into map1
        for (String key : mapTwo.keySet()) {
            if (mapOne.containsKey(key)) {
                mapOne.put(key, mapOne.get(key) + mapTwo.get(key));
            } else {
                mapOne.put(key, mapTwo.get(key));
            }
        }

        System.out.println("\nMerged Map: " + mapOne);
    }
}