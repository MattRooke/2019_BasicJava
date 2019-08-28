package week5;

import java.util.Scanner;

public class EvenOdd {
    int number;

    public EvenOdd() {
        number = getUserInput();
    }

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.findEvenOdd(evenOdd.number);
    }

    public int getUserInput() {
        System.out.println("Enter an integer...");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    public void findEvenOdd(int userInput) {
        if (userInput % 2 == 0) {
            System.out.println("Number is Even!");
        } else {
            System.out.println("Number is Odd!");
        }
    }
}
