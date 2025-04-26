package com.gevernova.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {

    // Method to generate the first 'n' binary numbers using a queue
    public static void generateBinary(int n){
        Queue<String> queue = new LinkedList<>();
        queue.add("1"); // Add the first binary number "1"

        // Loop to generate and print binary numbers
        for(int i  = 0; i < n; i++){
            // Dequeue the front element
            String current = queue.poll();
            System.out.print(current + " "); // Print the current binary number

            // Generate the next two binary numbers by appending "0" and "1"
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args){
        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of binary numbers to generate
        System.out.println("Enter the number of binary numbers to generate: ");
        int num = scanner.nextInt();

        // Call the method to generate and print the binary numbers
        generateBinary(num);

    }
}
