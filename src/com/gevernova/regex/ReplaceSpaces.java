package com.gevernova.regex;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This  is   an example    with multiple spaces.";

        // Replace multiple spaces (two or more) with a single space
        String output = input.replaceAll("\\s{2,}", " ");

        System.out.println(output);
    }
}