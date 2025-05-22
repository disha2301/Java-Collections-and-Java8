/* 🔸 Task: Print the top 3 longest strings.
List<String> names = Arrays.asList("alex", "christopher", "bob", "davidson", "evan");
*/

package com.gevernova.javaeight.streamapi.practicequestion;
import java.util.*;
import java.util.stream.Collectors;

public class Top3LongestString{
    public static void main(String[] args) {
        // list of names
        List<String> names = Arrays.asList("disha","alex", "christopher", "bob", "davidson", "evan");
        List<String> top3Longest = names.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 longest names: " + top3Longest);
    }
}