package week5;

import javax.swing.*;

// Plan A $49/month: < 500mins talk, no text, no data
// Plan B $55/month: < 500mins talk, any text, no data
// Plan C $61/month: >= 500mins talk, < 100 text, no data
// Plan D $70/month: >= 500mins talk, > 100 text, no data
// Plan E $79/month: >= 500mins talk, > 100 text, < 2GB data
// Plan F $87/month: >= 500mins talk, > 100 text, > 2GB data
public class CellPhoneService {
    public static void main(String[] args) {
        int talk, text, data;
        String input;
        talk = getUserInfo("Enter your maximum monthly talk minutes.");
        text = getUserInfo("Enter your maximum monthly text messages sent.");
        data = getUserInfo("Enter your maximum monthly gigabytes of data used.");
        if (data > 2) {
            JOptionPane.showMessageDialog(null, "The best plan based on you usage is:\nPlan F at $87/month");
        } else {
            if (data > 0) {
                JOptionPane.showMessageDialog(null, "The best plan based on you usage is:\nPlan E at $79/month");
            } else {
                if (text >= 100) {
                    JOptionPane.showMessageDialog(null, "The best plan based on you usage is:\nPlan D at $70/month");
                } else {
                    if (text > 0 && talk >= 500) {
                        JOptionPane.showMessageDialog(null, "The best plan based on you usage is:\nPlan C at $61/month");
                    } else {
                        if (text > 0) {
                            JOptionPane.showMessageDialog(null, "The best plan based on you usage is:\nPlan B at $55/month");
                        } else {
                            JOptionPane.showMessageDialog(null, "The best plan based on you usage is:\nPlan A at $49/month");
                        }
                    }
                }
            }
        }
        System.out.println();
    }

    private static int getUserInfo(String message) {
        String input;
        int param;
        input = JOptionPane.showInputDialog(null, message);
        param = Integer.parseInt(input);
        return param;
    }

}
