package com.gevernova.collections.listinterface.rotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListRotation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter space separated numbers");
        String str = scanner.nextLine();
        String[] inputArray = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String item : inputArray){
            list.add(Integer.parseInt(item));
        }

        // input number of position to rotate
        System.out.println("Enter the number of positions to rotate ");
        int pos = scanner.nextInt();

        // perform rotation
        rotateList(list, pos);

        // output the rotate list
        System.out.println("Rotated list is "+list);
    }

    // method to rotate the list by the given number of positions
    public static void rotateList(List<Integer> list, int position){
        int size = list.size();
        // handle cases where position are greater than list size or negative

        position = position % size;
        if(position < 0){
            position += size;
        }
        Collections.rotate(list,position);
    }
}
