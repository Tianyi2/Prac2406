package Prac02;

import java.util.Scanner;
class QuartsToGallonsInteractive
{    
   public static void main(String[] args) 
   {
      final int QUARTS_IN_A_GALLON = 4;
      int numberQuartsNeeded;
      int gallonsNeeded;
      int quartsNeeded;

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter quarts needed >> ");
      numberQuartsNeeded = scanner.nextInt();

      gallonsNeeded = numberQuartsNeeded / QUARTS_IN_A_GALLON;
      quartsNeeded = numberQuartsNeeded % QUARTS_IN_A_GALLON;

      System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts", numberQuartsNeeded, gallonsNeeded, quartsNeeded);
   }
}