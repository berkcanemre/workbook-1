package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
        public static void main(String[] args) {
            Scanner articulatory = new Scanner(System.in);

// Ask the user for their name
            System.out.print("Enter your name: ");
            String employeeName = articulatory.nextLine();

// Ask the user for hours worked
            System.out.print("Enter hours worked: ");
            double hoursWorked = articulatory.nextDouble();

// Ask the user for the pay rate
            System.out.print("Enter your pay rate: ");
            double payRate = articulatory.nextDouble();

// Ask if overtime should be applied
            System.out.print("Would you like to include overtime pay? (Y/N): ");
// Read a single word
            String includeOvertime = articulatory.next();

// Line break for better readability
            System.out.println();

// (Optional) Calculate gross pay with overtime

            double grossPay;

            if (includeOvertime.equalsIgnoreCase("Y")) {
// Overtime calculation
                if (hoursWorked <= 40) {
                    grossPay = hoursWorked * payRate;
                } else {
                    double regularPay = 40 * payRate;
                    double overtimePay = (hoursWorked - 40) * (payRate * 1.5);
                    grossPay = regularPay + overtimePay;
                }
            } else {
// Regular calculation only (no overtime)
                grossPay = hoursWorked * payRate;
            }

// Show the results
            System.out.println("Employee Name: " + employeeName);
            System.out.printf("Gross Pay: $%.2f\n", grossPay);

// Close the scanner
            articulatory.close();
        }
    }