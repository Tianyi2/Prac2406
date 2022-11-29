package Prac02;// Dollars.java
import java.util.Scanner;
class Dollars
{    
  public static void main(String[] args) 
  {  
     int dollar;
     int twenties, tens, fives, ones, leftDollar;
     final int TWENTY = 20;
     final int TEN = 10;
     final int FIVE = 5;

     Scanner scanner = new Scanner(System.in);
     System.out.print("Number of dollars: ");
     dollar = scanner.nextInt();  // Get the dollars

     twenties = dollar / TWENTY; // Calculate the number of twenties by divide TWENTY (20) from the dollar
     leftDollar = dollar - (twenties * TWENTY);

     tens = leftDollar / TEN; // Calculate the number of tens by divide TEN (10) from the dollar
     leftDollar = leftDollar - (tens * TEN);

     fives = leftDollar / FIVE; // Calculate the number of fives by divide FIVE (5) from the dollar
     leftDollar = leftDollar - (fives * FIVE);

     ones = leftDollar; // Assign the leftDollar to ones, which is the number of ones

     // Display who many twenties, tens, fives, and ones in the dollars the user input
     System.out.printf("$%d can be converted to %d 20s + %d 10s + %d 5s + %d 1s", dollar, twenties, tens, fives, ones);
   }
}