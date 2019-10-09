package week10;

import javax.swing.*;
import java.awt.*;

public class JMovingFrame {

    private static int click = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(350, 250);

        JPanel north = new JPanel();
        JPanel south = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);

        JButton centerButton = new JButton("Move the label!");
        frame.add(centerButton);
        JLabel label = new JLabel();
        centerButton.addActionListener(e -> {
            click += 1;
            switch (click) {
                case 1:
                    north.add(label);
                    label.setText("North!");
                    break;
                case 2:
                    south.add(label);
                    label.setText("South!");
                    break;
                case 3:
                    east.add(label);
                    label.setText("East!");
                    break;
                case 4:
                    west.add(label);
                    label.setText("West!");
                    click = 0;
                    break;
            }
            frame.repaint();
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
