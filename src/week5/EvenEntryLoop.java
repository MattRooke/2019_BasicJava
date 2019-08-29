package week5;

import java.util.Scanner;

// Application that identifies even numbers entered by the user.
// Enter 999 to quit.
public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("Enter an even number please...");
        int userInput = getUserInput.nextInt();
        while (userInput != 999) {
            if (userInput % 2 == 0) {
                System.out.println("Good job!");
            } else
                System.out.println("No even number detected!\nPlease enter and even number...");
            userInput = getUserInput.nextInt();
        }
    }

}
