package Prac03;


import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String studentName;
        double studentGpa;
        Scanner input = new Scanner(System.in);

        System.out.print("Your name please: ");
        studentName = input.nextLine();  // Get the student's name

        System.out.print("You gpa please: ");
        studentGpa = input.nextDouble();  // Get the student's gpa

        countCredit(studentName, studentGpa);  //Compute the credit for hte student
    }

    public static void countCredit(String studentName, double studentGpa) {
        // Count the credit of the student.
        double credit;
        final double STUDENT_CREDIT_TIMES = 10;
        credit = studentGpa * STUDENT_CREDIT_TIMES;
        System.out.printf("Name: %s. GPA: %.2f. Credit: %.2f\n", studentName, studentGpa, credit);
    }
}
