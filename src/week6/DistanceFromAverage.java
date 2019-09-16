package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {
        final int MAX = 20;
        final double QUIT = 99999;
        ArrayList<Double> numbers = new ArrayList<>();
        double input = 0;
        int numberOfInputs = 0;
        double total = 0;


        Scanner userInput = new Scanner(System.in);

        while (!(input == QUIT) && numberOfInputs < MAX) {
            System.out.println("Enter a number, Enter 99999 to quit:");
            input = userInput.nextDouble();
            if (input == QUIT && numberOfInputs == 0) {
                System.out.println("Please enter at least 1 number before quitting:");
                input = userInput.nextDouble();
                numbers.add(input);
                numberOfInputs = numberOfInputs + 1;
            } else if (input != QUIT) {
                numbers.add(input);
                numberOfInputs = numberOfInputs + 1;
            }
        }
        for (Double number : numbers
        ) {
            total += number;
        }
        double average = total / numberOfInputs;
        System.out.println("Average = " + average);
        for (double number : numbers
        ) {
            double distanceFromAverage = average - number;
            System.out.printf("Number:%s   Distance from average:%s\n", number, Math.abs(distanceFromAverage));
        }
    }
}
