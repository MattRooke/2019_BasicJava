package week5.DebuggingExercises;
// DebugFive2_Fixed.java
// Decides if two numbers are evenly divisible

import java.util.Scanner;

public class DebugFive2_Fixed {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        firstNum = input.nextInt();
        System.out.print("Enter another number ");
        secondNum = input.nextInt();
        if ((firstNum % secondNum == 0) || (secondNum % firstNum) == 0)
            System.out.println("One of these numbers is evenly divisible into the other");
        else
            System.out.println("Neither of these numbers is evenly divisible into the other");
    }

}