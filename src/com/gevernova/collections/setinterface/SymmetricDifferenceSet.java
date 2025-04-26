package com.gevernova.collections.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifferenceSet {
    public static void main(String[] args){
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create two sets of integers to store the elements
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        // Input the size of set 1 and elements to be added to it
        System.out.print("Enter size of set 1: ");
        int sizeOne = scanner.nextInt();
        System.out.println("Enter elements in set 1:");
        for(int i = 0; i < sizeOne; i++){
            setOne.add(scanner.nextInt()); // Add each element to set 1
        }

        // Input the size of set 2 and elements to be added to it
        System.out.print("Enter size of set 2: ");
        int sizeTwo = scanner.nextInt();
        System.out.println("Enter elements in set 2:");
        for(int i = 0; i < sizeTwo; i++){
            setTwo.add(scanner.nextInt()); // Add each element to set 2
        }

        // Create a new set for symmetric difference
        Set<Integer> symmetricDifference = new HashSet<>(setOne); // Start with a copy of set 1
        symmetricDifference.addAll(setTwo); // Add all elements from set 2 to the symmetric difference set

        // Create a temporary set to find the intersection (common elements)
        Set<Integer> temp = new HashSet<>(setOne); // Start with a copy of set 1
        temp.retainAll(setTwo); // Retain only the common elements between set 1 and set 2

        // Remove the common elements (intersection) from the symmetric difference set
        symmetricDifference.removeAll(temp); // Remove elements that appear in both sets

        // Display the result of the symmetric difference
        System.out.println("Symmetric Difference result is: " + symmetricDifference);
    }
}
