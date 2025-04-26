package com.gevernova.collections.setinterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args){
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create a HashSet to store unique integers
        Set<Integer> set = new HashSet<>();

        // Ask the user to input the size of the set
        System.out.print("Enter size of the set: ");
        int size = scanner.nextInt();

        // Prompt the user to input elements for the set
        System.out.println("Enter the elements in the set:");
        for(int i = 0; i < size; i++){
            set.add(scanner.nextInt()); // Add each element to the set (duplicates are automatically ignored)
        }

        // Convert the HashSet to an ArrayList (as HashSet doesn't maintain order)
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        // Display the sorted list
        System.out.println("Sorted List: " + list);
    }
}
