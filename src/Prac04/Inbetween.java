package Prac04;

import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int diff;

        // Get user inputs
        System.out.print("Enter integer 1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter integer 2: ");
        num2 = scanner.nextInt();


        diff = num1 - num2;
        if (diff >= -1 && diff <= 1)
            // Judge whether there are integers in between the two numbers
            System.out.println("There are no integers between " + num1 + " and " + num2);
        else {
            // Display the number in between.
            System.out.print("The numbers in between are:");
            if (num1 > num2)  // Find the bigger number first
                for (int i = num2 + 1; i < num1; i++)
                    System.out.print(" " + i);
            else
                for (int j = num1 + 1; j < num2; j++)
                    System.out.print(" " + j);
            System.out.println();
        }
    }
}


