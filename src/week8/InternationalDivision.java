package week8;

public class InternationalDivision extends Division {
    String country;
    String language;

    public InternationalDivision(String name, String accountNumber, String country, String language) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Division" +
                "\n Name: " + name +
                "\n Account Number: " + accountNumber +
                "\n Country: " + country +
                "\n Language: " + language + "\n";
    }
}
