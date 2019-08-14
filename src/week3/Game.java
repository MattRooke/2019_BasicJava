package week3;

import java.util.Random;

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
}
