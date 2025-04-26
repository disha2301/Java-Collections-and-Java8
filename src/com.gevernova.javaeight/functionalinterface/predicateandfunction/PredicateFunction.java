package com.gevernova.javaeight.functionalinterface.predicateandfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 20, 30, 40);

        // Predicate to filter even numbers
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Function to square a number
        Function<Integer, Integer> square = number -> number * number;

        // Step 1: Filter even numbers and Step 2: Square them
        List<Integer> squaredEvenNumbers = numbers.stream()
                .filter(isEven)
                .map(square)
                .collect(Collectors.toList());

        System.out.println("Squared Even Numbers: " + squaredEvenNumbers);
    }
}
