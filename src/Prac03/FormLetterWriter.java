package Prac03;

public class FormLetterWriter {
    public static void main(String[] args) {
        // Test for the first displaySalutation method
        displaySalutation("Zhang");
        displayLetter();

        // Test for the second displaySalutation method
        displaySalutation("Tianyi", "Zhang");
        displayLetter();
    }

    public static void displaySalutation(String lastName) {
        // Display the salutation with the last name of the person.
        System.out.println("Dear Mr. or Ms. " + lastName);
    }

    public static void displaySalutation(String firstName, String lastName) {
        // Display the salutation with the full name of the person.
        System.out.println("Dear " + firstName + " " + lastName);
    }

    public static void displayLetter() {
        // Display the thanks message.
        System.out.println("Thank you for your recent order.\n");
    }
}