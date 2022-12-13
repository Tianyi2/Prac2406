package Prac05;

public class TwelveInts {
    public static void main(String[] args) {
        // Number array with 12 numbers
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38, 45, 49, 52};

        // Print the number from first to last
        for (int number : numbers)
            System.out.print(number + "  ");
        System.out.println();

        // Print the number from last to first
        for (int i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}


