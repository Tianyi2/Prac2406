package Prac02;

class QuartsToGallons
{    
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_A_GALLON = 4;
      int numberQuartsNeeded = 18;
      int gallonsNeeded;
      int quartsNeeded;
      gallonsNeeded = numberQuartsNeeded / QUARTS_IN_A_GALLON; // Calculate the gallons by dividing the number of quarts in a gallon
      quartsNeeded = numberQuartsNeeded % QUARTS_IN_A_GALLON; // Calculate the quarts needed

      System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts", numberQuartsNeeded, gallonsNeeded, quartsNeeded);
   }
}