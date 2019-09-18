package week8;

public class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String number) {
        super(number);
        setCost();
    }

    @Override
    public void setCost() {
        super.cost = 0.02f;
    }

    @Override
    public String toString() {
        return "Phone Number: " + phoneNumber +
                "\nRate: $" + cost +
                "\nCost for this call: $" + cost + "\n";
    }
}
