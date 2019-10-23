package week12;

import javax.swing.*;
import java.awt.*;

public class JFontSizePanel extends JPanel {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Font Size");
        JFontSizePanel mainPanel = new JFontSizePanel();
        mainPanel.drawPhrases(6, 20);
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    void drawPhrases(int lowerLimit, int upperLimit) {
        setLayout(new GridLayout(0, 1));
        for (int i = lowerLimit; i <= upperLimit; i++) {
            JLabel phraseLabel = new JLabel("You can't get an exception... if you don't write any code.");
            phraseLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, i));
            add(phraseLabel);
        }
    }
}
