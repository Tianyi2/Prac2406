package Prac05;

import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args) {
       // Declare variables and get scanner
        String name1, name2, name3;
        Scanner scanner = new Scanner(System.in);

       // Get the names from user
        System.out.print("Enter name1: ");
        name1 = scanner.nextLine();
        System.out.print("Enter name2: ");
        name2 = scanner.nextLine();
        System.out.print("Enter name3: ");
        name3 = scanner.nextLine();

        // Print the six combinations of the three names
        System.out.println("The combinations are:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }
}