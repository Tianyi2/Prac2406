package Prac04;

public class Factorials {
    public static void main(String[] args) {
        final int MAXIMUM = 10;
        int factorial;
        // loop the 10 number from 10 to 1
        for (int i = MAXIMUM; i >= 1; i--) {
            factorial = i;
            for (int j = i-1; j > 0; j--)
                // calculate for the factorial
                factorial = factorial * j;
            System.out.println("The factorial of " + i + " is " + factorial); //Display message
        }
    }
}


