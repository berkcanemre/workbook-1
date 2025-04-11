package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

// Ask user for sandwich size
        System.out.println("Welcome to the Topher's Sandwich Shop!");
        System.out.println("What size would you like your sandwich:");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        System.out.print("Enter 1 or 2: ");

        int sandwichSize = scanner.nextInt();

        float basePrice = 0.0F;

        if (sandwichSize == 1) {
            basePrice = 5.45F;
        } else if (sandwichSize == 2) {
            basePrice = 8.95F;
        } else {
            System.out.println("We don't have that size, sorry. Exiting selections are...");
        }

// Ask user for their age
        System.out.print("May I get you age for your eligibility for discount: ");
        int age = scanner.nextInt();

        double discount = 0.0;
// 10% for students
        if (age <= 17) {
            discount = 0.10;
// 20% for seniors
        } else if (age >= 65) {
            discount = 0.20;
        }

//Calculate final price
        double discountAmount = basePrice * discount;
        double finalPrice = basePrice - discountAmount;

//Display the cost
        System.out.printf("Your total is: $%.2f\n", finalPrice);
    }
}