package week5;

import java.util.Scanner;

//A simple program that counts in multiples determined by user input, from 3 to 300 inclusive.
//New line every 10 lines.
public class CountByAnything {
    public static final int START = 3;
    public static final int END = 300;
    public static final int LINES = 10;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number to count by:");
        int counter = userInput.nextInt();
        int currentLine = 1;
        for (int i = START; i <= END; i += counter) {
            System.out.print(i + " ");
            if (currentLine % LINES == 0) {
                System.out.println();
            }
            currentLine++;
        }
    }
}
