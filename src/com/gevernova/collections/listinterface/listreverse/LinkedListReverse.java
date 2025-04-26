package com.gevernova.collections.listinterface.listreverse;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        // taking sample input
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(-85);

        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            reversedLinkedList.add(list.get(i));
        }
        System.out.println("Reversed Linked List is as follows ");
        System.out.println(reversedLinkedList);
    }
}
