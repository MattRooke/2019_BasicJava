package week4;

public class Billing {
    double cost;

    public void computeBill(double price) {
        double tax = price * 0.08;
        cost = price + tax;
    }

    public void computeBill(double price, double numBooks) {
        price = price * numBooks;
        double tax = price * 0.08;
        cost = price + tax;
    }

    public void computeBill(double price, double numBooks, double coupon) {
        price = price * numBooks;
        price -= coupon;
        double tax = price * 0.08;
        cost = price + tax;
    }

}
