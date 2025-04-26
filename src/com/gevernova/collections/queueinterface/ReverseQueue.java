package com.gevernova.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {

    // Method to reverse the queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        // Base case: if the queue is empty, we stop the recursion
        if (queue.isEmpty()) {
            return;
        }

        // Remove the front element from the queue
        int front = queue.poll();

        // Recursively reverse the remaining queue
        reverseQueue(queue);

        // Add the removed front element to the back of the queue after the recursion
        queue.add(front);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the queue
        Queue<Integer> queue = new LinkedList<>();

        // Prompt the user to enter the number of elements in the queue
        System.out.println("Enter the number of elements in the queue : ");
        int size = scanner.nextInt();

        // Ask the user to enter the elements of the queue
        System.out.println("Enter elements in the queue");
        for (int i = 0; i < size; i++) {
            queue.add(scanner.nextInt());  // Add each element to the queue
        }

        // Print the original queue
        System.out.println("Original queue : " + queue);

        // Call the reverseQueue method to reverse the queue
        reverseQueue(queue);

        // Print the reversed queue
        System.out.println("Reversed queue : " + queue);
    }
}
