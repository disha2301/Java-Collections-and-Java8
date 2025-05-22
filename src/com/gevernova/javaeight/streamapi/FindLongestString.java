package com.gevernova.javaeight.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args){
        List<String> string = Arrays.asList("Disha","Rashi","Shreya","Arushi","Sakshi");
        // use of stream to find the longest string
        Optional<String> longestName = string.stream()
                .max((s1,s2) ->Integer.compare(s1.length(), s2.length()));

        // Step 2: Display result
        longestName.ifPresent(name -> System.out.println("Longest name: " + name));
    }
}
