package com.gevernova.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// step 3: wildcard method to process resumes dynamically
public class ResumeScreeningSystem {
    // generic method to display all resumes
    public static void processAllResumes(List<? extends JobRole> jobRoles){
        for(JobRole jobRole : jobRoles){
            // display job description based on the job role
            jobRole.displayJobDesc();
        }
    }
    public static void main(String[] args){
        // step 4: create instances of different job roles
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>(new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager());

        // Step 5: Process the resumes dynamically using wildcards
        System.out.println("Processing all resumes:");
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(softwareEngineerResume.getJobRole());
        resumes.add(dataScientistResume.getJobRole());
        resumes.add(productManagerResume.getJobRole());

        // call the wildcard method to process the list of resumes
        processAllResumes(resumes);
    }
}
