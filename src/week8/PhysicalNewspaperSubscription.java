package week8;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    public PhysicalNewspaperSubscription(String name, String address) {
        super(name, address);
    }

    @Override
    public void setAddress() {
        super.rate = 0;
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String digit : numbers
        ) {
            if (address.contains(digit)) {
                super.rate = 15;
            }

        }

        if (super.rate == 0) {
            System.out.println("Error - Incorrect Address - \n Subscription for: " + super.name + "\n No street number found.\n");
            super.address = "ERROR-" + super.address + "-ERROR";
        }

    }

}
