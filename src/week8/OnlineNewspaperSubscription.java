package week8;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    public OnlineNewspaperSubscription(String name, String address) {
        super(name, address);
    }

    @Override
    public void setAddress() {
        if (address.contains("@")) {
            super.rate = 9;
        } else {
            super.rate = 0;
        }

        if (super.rate == 0) {
            System.out.println("Error - Invalid Email Address - \n Subscription for: " + super.name + "\n No @ email found.\n");
            super.address = "ERROR-" + super.address + "-ERROR";
        }

    }
}
