package week5.DebuggingExercises;
// DebugSix3_Fixed.java
// Prompt user for value to start
// Value must be between 1 and 20 inclusive
// At command line, count down to blastoff
// With a brief pause between each displayed value

import javax.swing.*;

public class DebugSix3_Fixed {
    public static void main(String[] args) {
        String userNumString;
        int userNum, val;
        final int MIN = 1;
        final int MAX = 20;
        userNumString = JOptionPane.showInputDialog(null,
                "Enter a number between " + MIN + " and " + MAX + " inclusive");
        userNum = Integer.parseInt(userNumString);
        while (userNum < MIN || userNum > MAX) {
            userNumString = JOptionPane.showInputDialog(null,
                    "Number out of range" +
                            "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
            userNum = Integer.parseInt(userNumString);
        }
        for (val = userNum; val > 0; val--) {
            System.out.print(val + "  ");
            // Adjust these numbers for faster or slower performance
            for (int x = 0; x < 100000; x++) {
                for (int y = 0; y < 100000; y++) {
                    for (int z = 0; z < 10000; z++) ;
                }
            }

        }
        System.out.println("Blastoff!");
    }
}






