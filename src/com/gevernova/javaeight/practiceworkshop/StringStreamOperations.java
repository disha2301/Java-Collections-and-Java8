package com.gevernova.javaeight.practiceworkshop;

import java.util.*;
import java.util.stream.Collectors;

public class StringStreamOperations {
    public static void main(String[] args) {

        // continued stream operations

        // 10. Count character occurrences in a string
        System.out.println("\n10. Character count:");
        String input = "programming";
        Map<Character, Long> charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(charCount);

        // 11. Duplicate characters
        System.out.println("\n11. Duplicate characters:");
        Set<Character> seen = new HashSet<>();
        Set<Character> dupes = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .collect(Collectors.toSet());
        System.out.println(dupes);

        // 12. First non-repeating character
        System.out.println("\n12. First non-repeating character:");
        Character firstNonRepeat = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println(firstNonRepeat);

        // 13. Second largest in array
        System.out.println("\n13. Second largest number:");
        int[] arr = {1, 3, 2, 5, 4, 5};
        Integer secondLargest = Arrays.stream(arr).boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(null);
        System.out.println(secondLargest);

        // 14. Longest string
        System.out.println("\n14. Longest string:");
        List<String> words = Arrays.asList("Java", "Programming", "Streams", "Collectors");
        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);

        // 15. Max number in array
        System.out.println("\n15. Max number:");
        int max = Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new);
        System.out.println(max);

        // 16. Elements starting with 1
        System.out.println("\n16. Numbers starting with 1:");
        List<Integer> nums = Arrays.asList(10, 11, 21, 13, 41);
        List<Integer> startsWith1 = nums.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(startsWith1);

        // 17. String.join example
        System.out.println("\n17. String.join:");
        String joined = String.join(", ", Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println(joined);

        // 18. Skip and limit example
        System.out.println("\n18. skip and limit:");
        nums.stream().skip(1).limit(3).forEach(System.out::println);
    }
}
