package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ask customer for sandwich size
        System.out.println("Welcome to the Topher's Sandwich Shop!");
        System.out.println("What size would you like your sandwich:");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int sandwichSize = scanner.nextInt();
        scanner.nextLine();

        float basePrice;

        if (sandwichSize == 1) {
            basePrice = 5.45f;
        } else if (sandwichSize == 2) {
            basePrice = 8.95f;
        } else {
            System.out.println("We don't have that size, sorry. Exiting selections are 1 or 2");
            scanner.close();
            return;
        }

//Ask customer if they want the sandwich loaded
        System.out.print("Would you like your sandwich loaded? (yes/no): ");
        String loadedAnswer = scanner.nextLine().trim().toLowerCase();

        if (loadedAnswer.equals("yes")) {
            if (sandwichSize == 1) {
                basePrice += 1.00F;
            } else if (sandwichSize == 2) {
                basePrice += 1.75F;
            }
        }

// Ask customer for their age
        System.out.print("May I get you age for your eligibility for discount: ");
        int age = scanner.nextInt();

        float discount = 0.0f;

        if (age <= 17) {
            discount = 0.10f; // 10% for students
        } else if (age >= 65) {
            discount = 0.20f; // 20% for seniors
        }

//Calculate final price
        float discountAmount = basePrice * discount;
        float finalPrice = basePrice - discountAmount;

//Display the cost
        System.out.printf("Your total is: $%.2f\n", finalPrice);

        scanner.close();
    }
}