package Prac04;

import java.util.Scanner;
class EvenOdd
{
   public static void main(String[] args) 
   {  
       Scanner input = new Scanner(System.in);
       int number;
       System.out.print("Enter the number: ");
       number = input.nextInt();
       if(isEven(number))
          System.out.println(number + " is even");
       else
          System.out.println(number + " is odd");
   }
   public static boolean isEven(int number)
   {
      return number % 2 == 0;
   }      
}
