package week12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JChangeSizeAndColourPanel extends JPanel {
    static int x = 10;
    static int clicks = 1;
    int y = 10;

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Colours :)");
        mainFrame.setSize(700, 300);
        mainFrame.setLayout(new BorderLayout());
        JChangeSizeAndColourPanel mainPanel = new JChangeSizeAndColourPanel();
        JButton phraseButton = new JButton("Click me!");
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.add(phraseButton, BorderLayout.SOUTH);
        phraseButton.addActionListener(e -> {
            clicks += 1;
            mainFrame.repaint();
            if (clicks == 4) {
                phraseButton.setEnabled(false);
            }
        });
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Trebuchet MS", Font.PLAIN, 30 - (clicks)));
        g.setColor(randomColour());
        g.drawString("This is a string", 30 + (clicks * 10), 30);
    }

    public Color randomColour() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r, g, b);
    }

}
