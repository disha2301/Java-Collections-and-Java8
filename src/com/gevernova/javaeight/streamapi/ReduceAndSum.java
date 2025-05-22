package com.gevernova.javaeight.streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceAndSum {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10,12,13,14,15,16,17,18,19,20);
        // step 1: filtering and adding only the even numbers
        int sumOfEven = numbers.stream()
                .filter(n -> n%2 == 0)
                .reduce(0,(a,b) -> a+b);
        System.out.println("Sum of all even numbers is : "+ sumOfEven);
    }

}
