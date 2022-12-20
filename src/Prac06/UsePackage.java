package Prac06;

public class UsePackage
{
   public static void main(String[] args)
   {
       // Create three package objects named p1, p2, p3
       Package p1 = new Package(4,'A'),
       p2 = new Package(10,'T'),
       p3 = new Package(20,'M');

       // Create three insured package objects named p4, p5, p6
       InsuredPackage p4 = new InsuredPackage(4,'A'),
       p5 = new InsuredPackage(10,'T'),
       p6 = new InsuredPackage(20,'M');

       // Print out the information (weight and cost) of each package.
       System.out.println("Packages:");
       p1.display();
       p2.display();
       p3.display();

       // Print out the information (weight and cost) of each insured package.
       System.out.println("Insured packages:");
       p4.display();
       p5.display();
       p6.display();
   }
}
