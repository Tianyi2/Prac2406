package Prac02;

import java.util.Scanner;
class Eggs
{    
  public static void main(String[] args) 
  {  
     final int DOZEN_NUMBER = 12;
     final double PRICE_PER_DOZEN = 3.25;
     final double PRICE_PER_INDIVIDUAL_EGG = 0.45;

     Scanner input = new Scanner(System.in);
     System.out.print("How many eggs?: ");
     int totalEggs = input.nextInt();  // Get the total eggs
     int numberOfDozenEgg = totalEggs / DOZEN_NUMBER; // Get the number of dozen of eggs
     int numberOfIndividualEggs = totalEggs % DOZEN_NUMBER; // Get the number of single eggs

     double totalPrice = numberOfDozenEgg * PRICE_PER_DOZEN + numberOfIndividualEggs * PRICE_PER_INDIVIDUAL_EGG; // Calculate the total price for the eggs

     System.out.printf("You ordered %d eggs. That's %d dozes at $%.2f per dozen and %d loose eggs at %d cents each for a total of $%.2f", totalEggs, numberOfDozenEgg, PRICE_PER_DOZEN, numberOfIndividualEggs, (int) (PRICE_PER_INDIVIDUAL_EGG * 100), totalPrice);
  }
}