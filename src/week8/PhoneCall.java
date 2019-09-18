package week8;

public abstract class PhoneCall {
    String phoneNumber;
    float cost;

    PhoneCall(String number) {
        this.phoneNumber = number;
        this.cost = 0.0f;
    }

    public abstract void setCost();

    public abstract String toString();

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public float getCost() {
        return this.cost;
    }

}
