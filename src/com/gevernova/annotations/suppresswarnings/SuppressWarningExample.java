package com.gevernova.annotations.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Raw list without generics
        List rawList = new ArrayList();
        rawList.add("Ahad");
        rawList.add("Disha");
        rawList.add(123); // mixing types

        // Assign raw list to generic list (unsafe)
        List<String> stringList = rawList;

        // Trying to print each element
        for (String str : stringList) {
            System.out.println(str); // might throw ClassCastException
        }
    }
}
