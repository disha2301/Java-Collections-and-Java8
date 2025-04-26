package com.gevernova.annotations.custom;

public class TaskManager {
    @TaskInfo(priority = "high", assignedTo = "Disha")
    public void completePaymentModule() {
        System.out.println("Completing payment module...");
    }

    @TaskInfo(priority = "low", assignedTo = "Ahad")
    public void writeDocumentation() {
        System.out.println("Writing documentation...");
    }
}
