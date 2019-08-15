package week3;

import java.util.Scanner;

public class InchesToFeetInteractive {
    private static final int CONVERSION = 12;
    private int inputInches;
    private int outputInches;
    private int outputFeet;

    public static void main(String[] args) {
        InchesToFeetInteractive convert = new InchesToFeetInteractive();
        convert.inputInches = convert.userInput();
        convert.convertInput(convert.inputInches);
        System.out.println(convert.inputInches + " inches =");
        System.out.println(convert.outputFeet + " feet and " + convert.outputInches + " inches");
    }

    private int userInput() {
        System.out.println("Enter inches to be converted;");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private void convertInput(int input) {
        outputInches = input % CONVERSION;
        int roundInches = inputInches - outputInches;
        outputFeet = roundInches / CONVERSION;

    }
}
