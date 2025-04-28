package com.gevernova.generics.universitycoursemanagementsystem;
// generic course class
class Course <T extends CourseType> {
    private String courseName;
    private T courseType;

    // constructor
    public Course(String courseName, T courseType){
        this.courseName = courseName;
        this.courseType = courseType;
    }
    // method to display
    public void displayCourseDetails(){
        System.out.println("Course Name : "+courseName);
        courseType.displayCourse();
    }
}
