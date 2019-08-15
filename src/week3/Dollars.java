package week3;

import java.util.Scanner;

public class Dollars {
    private static final int TWENTIES = 20;
    private static final int TENS = 10;
    private static final int FIVES = 5;
    private static final int ONES = 1;
    int amount;

    public static void main(String[] args) {
        Dollars dollars = new Dollars();
        dollars.amount = dollars.userInput();
        System.out.println("$" + dollars.amount + " into largest denominations is:");
        int remainder = dollars.denominationCalculator(dollars.amount, TWENTIES, " $20");
        remainder = dollars.denominationCalculator(remainder, TENS, " $10");
        remainder = dollars.denominationCalculator(remainder, FIVES, " $5");
        dollars.denominationCalculator(remainder, ONES, " $1");


    }

    int denominationCalculator(int input, int denomination, String name) {
        int remainder = input % denomination;
        int numOfDenomination = (input - remainder) / denomination;
        if (numOfDenomination > 1) {
            System.out.println(numOfDenomination + name + "s");
        } else {
            System.out.println(numOfDenomination + name);
        }
        return remainder;
    }

    private int userInput() {
        System.out.println("Enter amount to be sorted;");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();

    }

}
