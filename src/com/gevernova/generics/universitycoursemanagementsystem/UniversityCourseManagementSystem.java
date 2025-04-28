package com.gevernova.generics.universitycoursemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Create different course objects
        Course<ExamCourse> examCourse = new Course<>("Computer Science", new ExamCourse());
        Course<AssignmentCourse> assignCourse = new Course<>("Computer Assignment", new AssignmentCourse());
        Course<ResearchCourse> researchCourse = new Course<>("Research work", new ResearchCourse());

        // List of courses with different evaluation methods using wildcard
        List<Course<? extends CourseType>> courses = new ArrayList<>();
        courses.add(examCourse);
        courses.add(assignCourse);
        courses.add(researchCourse);

        // Display all course details
        displayAllCourses(courses);  // Pass the courses list as an argument
    }

    // Method to display all courses using wildcard
    public static void displayAllCourses(List<Course<? extends CourseType>> courses) {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();  // Displays the details of each course
        }
    }
}