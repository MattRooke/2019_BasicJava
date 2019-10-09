package week10;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JColourFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        JPanel north = new JPanel();
        JPanel south = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);

        JButton centerButton = new JButton("Change the colours!");
        frame.add(centerButton);
        centerButton.addActionListener(e -> {
            Random random = new Random();
            int randomPanel = random.nextInt(4);
            int R = random.nextInt(255);
            int G = random.nextInt(255);
            int B = random.nextInt(255);
            switch (randomPanel) {
                case 0:
                    north.setBackground(new Color(R, G, B));
                    break;
                case 1:
                    south.setBackground(new Color(R, G, B));
                    break;
                case 2:
                    east.setBackground(new Color(R, G, B));
                    break;
                case 3:
                    west.setBackground(new Color(R, G, B));
                    break;
            }
            frame.repaint();
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
