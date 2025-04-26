package com.gevernova.collections.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetSubsetCheck {
    public static void main(String[] args){
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create two sets of integers
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        // Input the size of set 1 and elements to be added to it
        System.out.print("Enter size of set 1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter elements in set 1:");
        for(int i = 0; i < size1; i++){
            setOne.add(scanner.nextInt()); // Add each element to set 1
        }

        // Input the size of set 2 and elements to be added to it
        System.out.print("Enter size of set 2: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter elements in set 2:");
        for(int i = 0; i < size2; i++){
            setTwo.add(scanner.nextInt()); // Add each element to set 2
        }

        // Check if set1 is a subset of set2
        boolean isSubset = setTwo.containsAll(setOne);

        // Display the result
        if(isSubset){
            System.out.println("Set 1 is a subset of Set 2.");
        } else {
            System.out.println("Set 1 is not a subset of Set 2.");
        }
    }
}
