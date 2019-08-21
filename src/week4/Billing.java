package week4;

public class Billing {
    double price;

    public Billing(double price) {
        this.price = price;
    }

    public double computeBill(price) {
        double tax = price * 0.08;
        return price + tax;
    }
}
