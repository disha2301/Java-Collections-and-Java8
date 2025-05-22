package com.gevernova.javaeight.practiceworkshop;
import java.util.List;

class Student {
    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;

    // constructor to initialize the student obj
    public Student(int id, String firstName, int age, String gender, String dept,String city, int rank, List<String> contacts){
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }
    // use of getter to get the values
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getDept(){
        return dept;
    }
    public String getCity(){
        return city;
    }
    public int getRank(){
        return rank;
    }
    public List<String> getContacts(){
        return contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
