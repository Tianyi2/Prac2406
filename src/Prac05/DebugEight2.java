package Prac05;

// Sum and average an array of integers
public class DebugEight2
{
    public static void main(String[] args)
    {
        int[] someNumbs = {4, 17, 22, 8, 35};
        int tot = 0;
        int x;
        for(x = 0; x < someNumbs.length; ++x)
            tot += someNumbs[x];
        System.out.println("Sum is " + tot);
        System.out.println("Average is " + tot * 1.0 / someNumbs.length);
    }
}