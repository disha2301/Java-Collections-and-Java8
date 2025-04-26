package com.gevernova.collections.queueinterface;
import java.util.Scanner;

public class CircularBuffer {
    int[] buffer; // Array to store buffer elements
    int size;     // Fixed size of the buffer
    int start;    // Points to the oldest element
    int count;    // Current number of elements

    // Constructor to initialize the buffer
    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        start = 0;
        count = 0;
    }

    // Method to insert elements into the buffer
    public void insert(int value) {
        int index = (start + count) % size; // Calculate correct position
        if (count == size) {
            // Buffer is full, overwrite oldest
            start = (start + 1) % size; // Move start forward
            index = (start + count - 1) % size;
        } else {
            count++;
        }
        buffer[index] = value;
    }

    // Method to display the buffer contents
    public void display() {
        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index] + " ");
        }
        System.out.println("]");
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter buffer size: ");
        int size = scanner.nextInt();

        CircularBuffer cb = new CircularBuffer(size);

        while (true) {
            System.out.println("\n1. Insert\n2. Display\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter number to insert: ");
                int num = scanner.nextInt();
                cb.insert(num);
            } else if (choice == 2) {
                cb.display();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
