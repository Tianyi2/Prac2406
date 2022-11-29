package Prac02;

import java.util.Scanner;

class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_A_GALLON = 4;
        int numberQuartsNeeded;
        int gallonsNeeded;
        int quartsNeeded;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quarts needed >> ");
        numberQuartsNeeded = scanner.nextInt();  // Get the number of quarts needed

        gallonsNeeded = numberQuartsNeeded / QUARTS_IN_A_GALLON; // Calculate the gallons by dividing the number of quarts in a gallon
        quartsNeeded = numberQuartsNeeded % QUARTS_IN_A_GALLON; // Calculate the quarts needed

        System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts", numberQuartsNeeded, gallonsNeeded, quartsNeeded);
    }
}