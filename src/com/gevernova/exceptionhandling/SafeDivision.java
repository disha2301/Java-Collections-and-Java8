package com.gevernova.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SafeDivision {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            // take user input
            System.out.println("Enter first number");
            int numOne = scanner.nextInt();
            System.out.println("Enter second  number");
            int numSecond = scanner.nextInt();
            //perform division
            int divisionResult = numOne/numSecond;
            System.out.println("Result is : "+divisionResult);
        } catch(ArithmeticException e){
            System.out.println("Division by 0 is invalid");
        }catch(InputMismatchException e){
            System.out.println("Only Integer values are allowed");
        } finally{
            System.out.println("Program has ended");
        }
    }
}
