package Prac06;

public class DemoCandles {
    public static void main(String[] args) {
        // Set the candle variables
        Candle candle = new Candle();
        candle.setColor("pink");
        candle.setHeight(6);


        System.out.println("The " + candle.getHeight() + " inch " + candle.getColor() + " candle costs $" + candle.getPrice());


        // Set teh scentedCandle variables
        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setColor("white");
        scentedCandle.setScent("gardinia");
        scentedCandle.setHeight(6);

        // Print out the information about the scentedCandle
        System.out.println("The " + scentedCandle.getHeight() + " inch " + scentedCandle.getScent() + " " + scentedCandle.getColor() + " candle costs $" + scentedCandle.getPrice());
    }
}
