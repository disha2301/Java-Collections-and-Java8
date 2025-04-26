package com.gevernova.javaeight.functionalinterface.numberimplementation;

public class NumberImplementation {
    public static void main(String[] args){
        // lambda to add three numbers
        TriFunction<Integer, Integer, Integer, Integer> addThreeNum = (a,b,c) -> a+b+c;
        int result = addThreeNum.apply(10,10,10);
        System.out.println("Sum : "+result);
    }
}
