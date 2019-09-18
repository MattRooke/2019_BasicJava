package week8;

public class OutgoingPhoneCall extends PhoneCall {
    int time;
    float totalCost;

    OutgoingPhoneCall(String number, int minutes) {
        super(number);
        this.time = minutes;
        setCost();
        totalCost = time * cost;
    }

    @Override
    public void setCost() {
        super.cost = 0.04f;
    }

    @Override
    public String toString() {
        return "Phone Number: " + phoneNumber +
                "\nRate: $" + cost + " per min" +
                "\nNumber of minutes: " + time +
                "\nCost for this call: $" + totalCost + "\n";
    }
}
