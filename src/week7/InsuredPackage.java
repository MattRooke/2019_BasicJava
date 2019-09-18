package week7;

public class InsuredPackage extends Package {
    InsuredPackage(int weightInOunces, char shippingMethod) {
        super(weightInOunces, shippingMethod);
        calculateCost();
        calculateInsuranceCost();
    }

    public void calculateInsuranceCost() {
        if (cost > 0 && cost <= 1) {
            cost = cost + 2.45f;
        } else if (cost > 1 && cost <= 3) {
            cost = cost + 3.95f;
        } else
            cost = cost + 5.55f;
    }
}
