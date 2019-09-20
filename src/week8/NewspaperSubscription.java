package week8;

public abstract class NewspaperSubscription {
    String name;
    String address;
    int rate;

    public NewspaperSubscription(String name, String address) {
        this.name = name;
        this.address = address;
        setAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public int getRate() {
        return rate;
    }

    public abstract void setAddress();

    @Override
    public String toString() {
        return "Subscriber:" +
                "\n Name: " + this.name +
                "\n Address: " + this.address +
                "\n Cost: $" + this.rate + "\n";
    }
}
