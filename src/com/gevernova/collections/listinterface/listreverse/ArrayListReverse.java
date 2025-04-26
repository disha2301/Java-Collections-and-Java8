package com.gevernova.collections.listinterface.listreverse;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReverse {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        // taking sample input
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(-85);
        List<Integer> reversedList = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            reversedList.add(list.get(i));
        }
        System.out.println("Reversed array list is as follows ");
        System.out.println(reversedList);
    }
}
