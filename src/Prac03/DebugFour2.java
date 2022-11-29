package Prac03;

// Some circle statistics
public class DebugFour2
{
    public static void main(String[] args)
    {
        double radius = 12.6;
        System.out.println("Circle statistics");
        double area = java.lang.Math.PI * radius * radius;
        System.out.printf("area is %.2f\n", area);
        double diameter = 2 * radius;
        System.out.println("diameter is " + diameter);
    }
}