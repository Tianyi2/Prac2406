package Prac03;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args) {
        int userInteger;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the integer: ");
        userInteger = input.nextInt(); // Get the integer

        convertCentimeters(userInteger); // Assume the integer is inches and convert to centimeters
        convertLiters(userInteger); // Assume the integer is gallons and convert to liters
    }

    public static void convertLiters(int gallons) {
        // Convert gallons to liters.
        double liters;
        final double gallonsToLitersRate = 3.7854;
        liters = gallons * gallonsToLitersRate;
        System.out.printf("%d gallons is %.2f liters as one gallons is %.4f liters\n", gallons, liters, gallonsToLitersRate);
    }

    public static void convertCentimeters(int inches) {
        // Convert inches to centimeters.
        double centimeters;
        final double inchesToCentimetersRate = 2.54;
        centimeters = inches * inchesToCentimetersRate;
        System.out.printf("%d inches is %.2f centimeters as one inches is %.2f centimeters\n", inches, centimeters, inchesToCentimetersRate);
    }
}
