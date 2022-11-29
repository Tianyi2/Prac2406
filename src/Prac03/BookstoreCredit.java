package Prac03;


import java.util.Scanner;
public class BookstoreCredit
{
  public static void main (String[] args)
  {
     String studentName;
     double studentGpa;
     Scanner input = new Scanner(System.in);
     System.out.print("Your name please: ");
     studentName = input.nextLine();
     System.out.print("You gpa please: ");
     studentGpa = input.nextDouble();
     countCredit(studentName, studentGpa);
  }

  public static void countCredit(String studentName, double studentGpa)
  {
     double credit;
     final double STUDENT_CREDIT_TIMES = 10;
      credit = studentGpa * STUDENT_CREDIT_TIMES;
      System.out.printf("Name: %s. GPA: %.2f. Credit: %.2f\n", studentName, studentGpa, credit);
  }
}
