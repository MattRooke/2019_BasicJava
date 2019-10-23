package week12;

import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel {
    public static int numberOfSquares = 9;
    int sideLength = 660;

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Nested Boxes");
        mainFrame.setLayout(new BorderLayout());
        JNestedBoxesPanel mainPanel = new JNestedBoxesPanel();
        mainPanel.setPreferredSize(new Dimension(340, 340));
        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < numberOfSquares; i++) {
            int start = 20 * i;
            sideLength = sideLength - 40;
            g.drawRect(start, start, sideLength, sideLength);
        }
    }

}
