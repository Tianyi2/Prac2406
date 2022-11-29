package Prac03;

public class Billing
{
   final static double TAX = 0.08;
   public static void main(String[] args)
   {
      double bill;
      bill = computeBill(24.99);
      System.out.printf("Cost of $24.99 has a bill of $%.2f\n", bill);

      bill = computeBill(17.50, 4);
      System.out.printf("Cost of $24.99 and a quantity of 4 has a bill of $%.2f\n", bill);

      bill = computeBill(10.00, 6, 20.00);
      System.out.printf("Cost of $24.99, a quantity of 4, and a coupon of 20 has a bill of $%.2f\n", bill);
    }

   public static double computeBill(double amt){
      return amt + amt * TAX;
   }

   public static double computeBill(double amt, int quantity){
      return amt * quantity * (1+TAX);
   }

   public static double computeBill(double amt, int quantity, double coupon){
      return (amt * quantity - coupon) * (1+TAX);
   }
}