package week8;

public class DomesticDivision extends Division {
    String state;

    public DomesticDivision(String name, String accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }

    @Override
    public String toString() {
        return "Division" +
                "\n Name: " + name +
                "\n Account Number: " + accountNumber +
                "\n State: " + state + "\n";
    }
}
