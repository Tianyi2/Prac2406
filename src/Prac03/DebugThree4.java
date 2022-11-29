package Prac03;

// This program calculates tuition bills as credits times rate per credit hour
public class DebugThree4 {
    public static void main(String[] args) {
        int myCredits = 13;
        int yourCredits = 17;
        double rate = 75.84;
        System.out.println("My tuition:");
        tuitionBill(myCredits, rate);
        System.out.println("Your tuition:");
        tuitionBill(yourCredits, rate);
    }

    public static void tuitionBill(double c, double r) {
        System.out.printf("Total due %.2f\n", (r * c));
    }
}