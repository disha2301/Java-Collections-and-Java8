package com.gevernova.javaeight.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Disha","Yadav","Rashi","Shreya","Sakshi","Arushi");
        // step 1: filter the names starting with 'A' and convert them to upper case
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names starting with A are : "+result);
    }

}
