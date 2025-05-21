package com.gevernova.workshopfour.secondreview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStreamOperations {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122,
                                Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67,
                                Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164,
                                Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26,
                                Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12,
                                Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90,
                                Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324,
                                Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433,
                                Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7,
                                Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98,
                                Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. Students with rank between 50 and 100
        System.out.println("1. Rank between 50 and 100:");
        studentList.stream()
                .filter(s -> s.getRank() > 50 && s.getRank() < 100)
                .forEach(System.out::println);

        // 2. Students from Karnataka sorted by name
        System.out.println("\n2. Karnataka Students sorted by name:");
        studentList.stream()
                .filter(s -> s.getCity().equalsIgnoreCase("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .forEach(System.out::println);

        // 3. All department names
        System.out.println("\n3. Departments:");
        studentList.stream()
                .map(Student::getDept)
                .distinct()
                .forEach(System.out::println);

        // 4. All contact numbers
        System.out.println("\n4. All contact numbers:");
        studentList.stream()
                .flatMap(s -> s.getContacts().stream())
                .forEach(System.out::println);

        // 5. Group by department
        System.out.println("\n5. Grouped by Department:");
        Map<String, List<Student>> deptGroup = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));
        deptGroup.forEach((dept, students) ->
                System.out.println(dept + ": " + students.size() + " students"));

        // 6. Department with most students
        System.out.println("\n6. Department with max students:");
        String maxDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Max Dept : " + maxDept);

        // 7. Average age by gender
        System.out.println("\n7. Average age by gender:");
        Map<String, Double> avgAge = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.averagingInt(Student::getAge)));
        System.out.println(avgAge);

        // 8. Highest rank per department
        System.out.println("\n8. Highest rank in each department:");
        studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.maxBy(Comparator.comparingInt(Student::getRank))))
                .forEach((dept, student) -> System.out.println(dept + ": " + student.get()));

        // 9. Student with second rank
        System.out.println("\n9. Student with second rank:");
        Student second = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(second);

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
