package com.gevernova.collections.listinterface.nthelement;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NthFromEnd{
    public static String findNthFromEnd(List<String> list, int N){
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast N steps ahead
        for(int i = 0; i < N; i++){
            if(!fast.hasNext()) return "N is too large!";
            fast.next();
        }
        // move both iterators until fast reaches the end
        while(fast.hasNext()){
            fast.next();
            slow.next();
        }
        return slow.next(); // slow now points to Nth from end
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        // input size
        System.out.print("Enter number of elements : ");
        int size = scanner.nextInt();

        // input elements
        System.out.println("Enter elements : ");
        for(int i = 0; i<= size; i++){
            list.add(scanner.nextLine());
        }

        // Input N
        System.out.print("Enter N (position from end): ");
        int N = scanner.nextInt();

        // output
        String result = findNthFromEnd(list, N);
        System.out.println("Nth element from the end is : "+result);
    }
}