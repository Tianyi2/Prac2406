package Prac04;

import java.util.ArrayList;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int num1, num2, num3;
        int low, med, high;

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer... ");
        num1 = scanner.nextInt();
        System.out.print("And another... ");
        num2 = scanner.nextInt();
        System.out.print("And just one more... ");
        num3 = scanner.nextInt();

        // Create teh number list
        ArrayList<Integer> number_list = new ArrayList<>();
        number_list.add(num1);
        number_list.add(num2);
        number_list.add(num3);

        // Initialize low, median, and high number
        low = num1;
        med = num2;
        high = num3;

        // Get the low, median, and high number
        for (Integer integer : number_list) {
            if (integer < low) {
                low = integer;
            }
            if (integer > high) {
                high = integer;
            }
        }
        for (Integer integer : number_list) {
            if ((integer != high) && (integer != low)){
                med = integer;
            }
        }

        // Print the statement
        System.out.println("Ascending: " + low + " " +
                med + " " + high);
        System.out.println("Descending: " + high + " " +
                med + " " + low);


    }
}
