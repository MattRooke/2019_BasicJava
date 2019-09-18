package week7;

public class Candle {
    String colour;
    int height;
    float price;


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = height * 2f;
    }

    public float getPrice() {
        return price;
    }

}
