package week7;

public class Package {
    int weight;
    char method;
    float cost;

    Package(int weightInOunces, char shippingMethod) {
        this.weight = weightInOunces;
        this.method = shippingMethod;
        calculateCost();
    }

    public void calculateCost() {
        String weightRange;
        if (this.weight > 0 && this.weight <= 8)
            weightRange = "1-8";
        else if (this.weight > 8 && this.weight <= 16)
            weightRange = "9-16";
        else
            weightRange = "17+";
        switch (weightRange + method) {
            case "1-8A":
                this.cost = 2.00f;
                break;
            case "1-8T":
            case "9-16M":
                this.cost = 1.50f;
                break;
            case "1-8M":
                this.cost = 0.50f;
                break;
            case "9-16A":
                this.cost = 3.00f;
                break;
            case "9-16T":
                this.cost = 2.35f;
                break;
            case "17+A":
                this.cost = 4.50f;
                break;
            case "17+T":
                this.cost = 3.25f;
                break;
            case "17+M":
                this.cost = 2.15f;
                break;
            default:
                this.cost = 0.00f;
                break;

        }
    }

    public String display() {
        String shippingMethod;
        String formatCost = String.format("%.2f", cost);
        switch (method) {
            case 'A':
                shippingMethod = "Air Freight";
                break;
            case 'T':
                shippingMethod = "Truck";
                break;
            case 'M':
                shippingMethod = "Mail";
                break;
            default:
                shippingMethod = "None";
                break;
        }
        return "Package" +
                "\n| Weight: " + weight + "oz" +
                "\n| Shipping Method: " + shippingMethod +
                "\n| Cost: $" + formatCost + "\n";
    }
}
