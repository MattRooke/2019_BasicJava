package week3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int count;
    int wins;
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // Assigns a random number from 1-10 inclusive.

    void makeGuess(int value) {
        count += 1;
        if (value == secret) {
            wins += 1;
        }
    }

    public static void main(String[] args) {
        Game guessingGame = new Game();
        guessingGame.makeGuess(guessingGame.userInput());
        if (guessingGame.wins == 1) {
            System.out.println("You won!");
        } else {
            System.out.println("Try Again!");
        }
    }

    private int userInput() {
        System.out.println("Guess a number from 1 to 10...");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
}
