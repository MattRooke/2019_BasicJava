package week7;

public class DemoCandle {
    public static void main(String[] args) {
        Candle blueCandle = new Candle();
        blueCandle.setColour("Blue");
        blueCandle.setHeight(3);
        System.out.printf("Normal Candle\n  Colour: %s\n  Height: %s\"\n  Price: $%.2f\n",
                blueCandle.getColour(), blueCandle.getHeight(), blueCandle.getPrice());

        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setColour("Red");
        scentedCandle.setHeight(4);
        scentedCandle.setScent("Rose");
        System.out.printf("Scented Candle\n  Colour: %s\n  Scent: %s\n  Height: %s\"\n  Price: $%.2f\n",
                scentedCandle.getColour(), scentedCandle.getScent(), scentedCandle.getHeight(), scentedCandle.getPrice());


    }
}
