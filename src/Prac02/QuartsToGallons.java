package Prac02;

// QuartsToGallons.java
class QuartsToGallons
{    
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_A_GALLON = 4;
      int numberQuartsNeeded = 18;
      int gallonsNeeded;
      int quartsNeeded;
      gallonsNeeded = numberQuartsNeeded / QUARTS_IN_A_GALLON;
      quartsNeeded = numberQuartsNeeded % QUARTS_IN_A_GALLON;
      System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts", numberQuartsNeeded, gallonsNeeded, quartsNeeded);
   }
}