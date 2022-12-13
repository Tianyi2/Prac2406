package Prac05;

import java.util.*;

public class DistanceFromAverage {
    public static void main(String[] args) {
        // Initialization
        final int QUIT = 99999; // The quit number
        double[] numbers = new double[20]; // Set the double array limit to 20 double values
        int numberInNumbers = 0;
        double entry;
        double total = 0;
        double average;
        int y;

        Scanner scanner = new Scanner(System.in);

        // Print start message
        System.out.print("Enter a number or enter " + QUIT + " to quit: ");
        entry = scanner.nextDouble(); // Get user input

        while (entry != QUIT && numberInNumbers+1 < numbers.length) {
            // if the user enter the QUIT number or entered 20 number do not execute the while loop
            numbers[numberInNumbers] = entry;
            total += numbers[numberInNumbers];
            numberInNumbers++;
            System.out.print("Enter next numeric value or " + QUIT + " to quit >> ");
            entry = scanner.nextDouble();
        }

        // Print message if no number is entered
        if (numberInNumbers == 0)
            System.out.println("No number was entered");
        else {
            // Print final calculation
            average = total / numberInNumbers; // The average
            System.out.println(numberInNumbers + " numbers are entered and the average is " + average);
            for (y = 0; y < numberInNumbers; y++)
                // Print the distance from the average for every number
                System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average");
        }
    }
}
