package com.gevernova.generics.resumescreeningsystem;
// step 2: define generic Resume class
class Resume<T extends JobRole> {
    private T jobRole;
    // constructor
    public Resume(T jobRole){
        this.jobRole = jobRole;
    }
    // getter method
    public T getJobRole(){
        return jobRole;
    }
    public void processResume(){
        System.out.println("Processing resume for the role of ");
        jobRole.displayJobDesc();
    }
}
