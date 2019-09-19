package week8;

public abstract class Division {
    String name;
    String accountNumber;

    public Division(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    @Override
    public abstract String toString();
}
