package com.gevernova.exceptionhandling.agevalidation;

public class InvalidAgeException extends RuntimeException {
    // constructor
    public InvalidAgeException(String message){
        super(message);
    }
}
