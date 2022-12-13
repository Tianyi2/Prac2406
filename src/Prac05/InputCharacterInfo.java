package Prac05;

import java.util.Scanner;

public class InputCharacterInfo {
    public static void main(String[] args) {
        char aChar;
        String aString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character... ");
        aString = scanner.nextLine(); // Get the string from user

        aChar = aString.charAt(0); // Set aChar to be the first character in the user string
        System.out.println("The character is " + aChar);

        // Check if the character is uppercase
        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");

        // Check if the character is lowercase
        if (Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");

        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar); // Print out the lowercase character
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar); // Print out the uppercase character

        // Check if the character is a letter or digit
        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar +
                    " is neither a letter nor a digit");

        // Check if the character is a whitespace
        if (Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");
    }
}
