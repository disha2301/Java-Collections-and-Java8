package com.gevernova.annotations.practice.pendingtasks;

public class ProjectFeatures {
    @Todo(task = "Implement user login", assignTo = "Disha", priority = "HIGH")
    public void loginFeature(){
        System.out.println("Working on login feature");
    }
    @Todo(task="Add password recovery feature", assignTo = "Ahad")
    public void passwordRecoveryFeature(){
        System.out.println("Working on password recovery feature");
    }
    public void completedFeature() {
        System.out.println("This feature is done!");
    }
}
