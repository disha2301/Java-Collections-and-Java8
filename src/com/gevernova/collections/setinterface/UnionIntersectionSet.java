package com.gevernova.collections.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersectionSet {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Create two sets of integers using HashSet
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        // Input the size of the first set and add elements to it
        System.out.print("Enter size of set 1: ");
        int siezOne = scanner.nextInt();
        System.out.println("Enter elements in set 1:");
        for (int i = 0; i < siezOne; i++) {
            setOne.add(scanner.nextInt()); // add each element to set 1
        }

        // Input the size of the second set and add elements to it
        System.out.print("Enter size of set 2: ");
        int sizeTwo = scanner.nextInt();
        System.out.println("Enter elements in set 2:");
        for (int i = 0; i < sizeTwo; i++) {
            setTwo.add(scanner.nextInt()); // add each element to set 2
        }

        // Compute the union of the two sets
        Set<Integer> unionSet = new HashSet<>(setOne); // start with set1
        unionSet.addAll(setTwo); // add all elements from set2 to unionSet

        // Compute the intersection of the two sets
        Set<Integer> intersectSet = new HashSet<>(setOne); // start with set1
        intersectSet.retainAll(setTwo); // retain only elements that are also in set2

        // Display the result for union and intersection
        System.out.println("Union Result is: " + unionSet); // union of both sets
        System.out.println("Intersection Result is: " + intersectSet); // intersection of both sets
    }
}
