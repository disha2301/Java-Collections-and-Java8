package com.gevernova.collections.listinterface.frequency;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // taking user input
        System.out.println("Enter the sentence");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] words = str.split(" ");
        // declaration of map for key and value type
        Map<String, Integer> freq = new HashMap<>();
        for(String item : words){
            // is words match
            if(freq.containsKey(item)){
                // increment
                freq.put(item, freq.get(item) + 1 );
            }
            else{
                // else put 1
                freq.put(item, 1);
            }
        }
        System.out.println("Frequency of elements is : "+freq);
    }
}
