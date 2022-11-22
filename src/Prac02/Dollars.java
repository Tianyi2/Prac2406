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
     dollar = scanner.nextInt();

     twenties = dollar / TWENTY;
     leftDollar = dollar - (twenties * TWENTY);

     tens = leftDollar / TEN;
     leftDollar = leftDollar - (tens * TEN);

     fives = leftDollar / FIVE;
     leftDollar = leftDollar - (fives * FIVE);

     ones = leftDollar;
     System.out.printf("$%d can be converted to %d 20s + %d 10s + %d 5s + %d 1s", dollar, twenties, tens, fives, ones);
   }
}