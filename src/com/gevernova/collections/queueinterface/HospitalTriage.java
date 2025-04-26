package com.gevernova.collections.queueinterface;

import java.util.PriorityQueue;
import java.util.Scanner;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    // constructor to initialize patient's name and severity
    public Patient(String name, int severity){
        this.name = name;
        this.severity = severity;
    }

    // this will help in ordering the patients based on the level of severity
    @Override
    public int compareTo(Patient other){
        return other.severity - this.severity; // higher severity first
    }

    @Override
    public String toString(){
        return name + " ( Severity : "+ severity + " )";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        System.out.println("Enter number of patients: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // input details of the patients
        for (int i = 0; i < n; i++) {
            System.out.println("Enter patient's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the severity of the patient on a scale of 1-10: ");
            int severity = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // add patients to the priority queue
            pq.add(new Patient(name, severity));
        }

        // display in the required order
        System.out.println("\nOrder of treatment (based on severity):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
