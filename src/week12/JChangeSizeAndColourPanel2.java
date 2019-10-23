package week12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JChangeSizeAndColourPanel2 extends JPanel {
    static final int X_BOUNDARY = 700;
    static final int Y_BOUNDARY = 300;
    static int clicks = 1;
    Random random = new Random();

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Colours :)");
        mainFrame.setSize(X_BOUNDARY, Y_BOUNDARY);
        mainFrame.setLayout(new BorderLayout());
        JChangeSizeAndColourPanel2 mainPanel = new JChangeSizeAndColourPanel2();
        JButton phraseButton = new JButton("Click me!");
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.add(phraseButton, BorderLayout.SOUTH);
        phraseButton.addActionListener(e -> {
            clicks += 1;
            mainFrame.repaint();
        });
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public void paint(Graphics g) {
        int size = random.nextInt(15) + 10;
        int x = random.nextInt(600);
        int y = random.nextInt((225 - 50) + 1) + 50;
        g.setFont(new Font("Trebuchet MS", Font.PLAIN, size));
        g.setColor(randomColour());
        g.drawString("This is a string", x, y);
        System.out.println("\nX: " + x);
        System.out.println("Y:" + y);
        System.out.println("Size:" + size);
    }

    public Color randomColour() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r, g, b);
    }

}
