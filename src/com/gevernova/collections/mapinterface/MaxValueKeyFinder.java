package com.gevernova.collections.mapinterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxValueKeyFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("How many entries? ");
        int num = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input key-value pairs
        for (int i = 0; i < num; i++) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            scanner.nextLine(); // consume newline
            map.put(key, value);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        System.out.println("\nKey with the highest value: " + maxKey);
    }
}

