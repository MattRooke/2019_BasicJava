package week9.Debuggers;
// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException

import javax.swing.*;

public class DebugTwelve4 {
    public static void main(String[] args) {
        String inStr;
        StringBuilder outString = new StringBuilder();
        final int MAX = 999;
        int[] emp = new int[4];
        for (int x = 0; x < emp.length; ++x) {
            inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");
            try {
                            emp[x] = Integer.parseInt(inStr);
            if (emp[x] > MAX) {
                throw (new FixDebugEmployeeIDException("Number too high " + emp[x]));
            }
         }
         catch(NumberFormatException error)
            {
                --x;
                JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
            } catch (FixDebugEmployeeIDException error)
            {
                --x;
                JOptionPane.showMessageDialog(null, inStr + "Number too high");
            }
        }
        for (int i : emp) {
            outString.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
    }
}