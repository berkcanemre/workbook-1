package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

// Ask the user for the first number
        System.out.print("Enter the first number: ");
        double firstNumber = calculator.nextDouble();

// Ask the user for the second number
        System.out.print("Enter the second number: ");
        double secondNumber = calculator.nextDouble();

// Line break for better readability
        System.out.println();

// Show possible operations
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

// Ask the user to select an operation
        System.out.print("Please select an option: ");
        String operation = calculator.next();  // Read user input

// Line break for better readability
        System.out.println();

// Always perform multiplication whatever the user's choice
        double result = firstNumber * secondNumber;

// Show the result
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
    }
}
