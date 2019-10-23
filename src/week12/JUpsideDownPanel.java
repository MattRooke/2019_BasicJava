package week12;

import javax.swing.*;
import java.awt.*;

public class JUpsideDownPanel extends JPanel {
    static int size = 30;
    static int x = 30;
    int y = 30;

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("UpsideDown");
        mainFrame.setSize(200, 150);
        mainFrame.setLayout(new BorderLayout());
        JUpsideDownPanel mainPanel = new JUpsideDownPanel();
        JButton phraseButton = new JButton("Flip!");
        JLabel phrase = new JLabel("My life");
        phrase.setFont(new Font(" ", Font.PLAIN, 30));
        mainPanel.add(phrase);
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.add(phraseButton, BorderLayout.SOUTH);
        phraseButton.addActionListener(e -> {
            if (size == 30) {
                size = -30;
                x = 130;
                mainFrame.repaint();
            } else {
                size = 30;
                x = 30;
                mainFrame.repaint();
            }

        });
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public void paint(Graphics g) {
        Font flipFont = new Font("Trebuchet MS", Font.PLAIN, size);
        g.setFont(flipFont);
        g.drawString("My Life", x, y);
    }

}
