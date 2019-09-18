package week7;

public class ScentedCandle extends Candle {
    String scent;

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.price = this.height * 3f;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
}
