package week5.DebuggingExercises;
// DebugFive4_Fixed.java
// Outputs highest of four numbers

import javax.swing.*;

public class DebugFive4_Fixed {
    public static void main(String[] args) {
        int one, two, three, four;
        String str, output;
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        one = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        two = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        three = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        four = Integer.parseInt(str);
        if (one > two && one > three && one > four)
            output = "Highest is: " + one;
        else if (two > three && two > four)
            output = "Highest is: " + two;
        else if (three > four)
            output = "Highest is: " + three;
        else
            output = "Highest is: " + four;
        JOptionPane.showMessageDialog(null, output);
    }
}


