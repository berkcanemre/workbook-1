package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1: Create two variables to represent the salary for Bob and Gary, name them
//bobSalary and garySalary. Create a new variable named
//highestSalary. Determine whose salary is greater using Math.max() and
//store the answer in highestSalary. Set the initial salary variables to any value
//you want. Print the answer (i.e "The highest salary is ...")

// declare variables here
        float bobSalary = 50000f;
        float garySalary = 62000f;

// then code solution
        double highestSalary = Math.max(bobSalary, garySalary);

// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
        System.out.println("The highest salary between Bob and Gary is: $" + highestSalary);
        System.out.println(); // Line spacing for clarity

// REPEAT FOR NEXT EXERCISE

// Question 2:Find and display the smallest of two variables named carPrice and
//truckPrice. Set the variables to any value you want.

        float carPrice = 25000f;
        float truckPrice = 32000f;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price between the car and the truck is: $" + lowestPrice);
        System.out.println();
// Question 3:Find and display the area of a circle whose radius is 7.25

        float radius = 7.25f;

        float areaOfCircle = (float) Math.PI * radius * radius;

        System.out.println("The area of a circle with radius 7.25 is: " + areaOfCircle);
        System.out.println();
// Question 4:Find and display the square root a variable after it is set to 5.0
        double number = 5.0;

        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of 5.0 is: " + squareRoot);
        System.out.println();
// Question 5: Find the distance between (5, 10) and (85, 50)
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between points (5,10) and (85,50) is: " + distance);
        System.out.println();
// Question 6: Find the absolute value of -3.8
        double negativeNumber = -3.8;

        double absoluteValue = Math.abs(negativeNumber);

        System.out.println("The absolute value of -3.8 is: " + absoluteValue);
        System.out.println();
// Question 7: Generate a random number between 0 and 1
        double randomNumber = Math.random();

        System.out.println("A random number between 0 and 1 is: " + randomNumber);
    }
}