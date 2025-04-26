package com.gevernova.collections.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEqualityCheck {

    // Method to check if two sets are equal
    public static boolean isEqual(Set<Integer> s1, Set<Integer> s2) {
        // equals() checks if both sets have the same elements, regardless of order
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare two sets of integers using HashSet
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        // Input size and elements for set 1
        System.out.print("Enter size of set 1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter elements in set 1:");
        for (int i = 0; i < size1; i++) {
            setOne.add(scanner.nextInt()); // add element to set 1
        }

        // Input size and elements for set 2
        System.out.print("Enter size of set 2: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter elements in set 2:");
        for (int i = 0; i < size2; i++) {
            setTwo.add(scanner.nextInt()); // add element to set 2
        }

        // Call method to compare the two sets
        boolean isEqual = isEqual(setOne, setTwo);

        // Display result
        System.out.println("Are the two sets equal? " + isEqual);
    }
}
