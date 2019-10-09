package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JMovieFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        frame.add(southPanel, BorderLayout.SOUTH);

        JLabel info = new JLabel();
        southPanel.add(info, BorderLayout.SOUTH);

        JButton northButton = new JButton("North by Northwest");
        frame.add(northButton, BorderLayout.NORTH);
        ActionListener northListener = e -> {
            info.setText("<html> <h3>North by Northwest</h3> Released: 1959 <br> Staring: Cary Grant </html>");
            frame.pack();
            frame.repaint();
        };
        northButton.addActionListener(northListener);

        JButton southButton = new JButton("South Wind");
        southPanel.add(southButton, BorderLayout.NORTH);
        ActionListener southListener = e -> {
            info.setText("<html> <h3>South Wind</h3> Released: 2018 <br> Staring: Miloš Biković <html>");
            frame.pack();
            frame.repaint();
        };
        southButton.addActionListener(southListener);

        JButton eastButton = new JButton("East is East");
        frame.add(eastButton, BorderLayout.EAST);
        ActionListener eastListener = e -> {
            info.setText("<html> <h3>East is East</h3> Released: 1999 <br> Staring: Om Puri <html>");
            frame.pack();
            frame.repaint();
        };
        eastButton.addActionListener(eastListener);

        JButton westButton = new JButton("Wild Wild West");
        frame.add(westButton, BorderLayout.WEST);
        ActionListener westListener = e -> {
            info.setText("<html> <h3>Wild Wild West</h3> Released: 1999 <br> Staring: Will Smith <html>");
            frame.pack();
            frame.repaint();
        };
        westButton.addActionListener(westListener);

        JButton centerButton = new JButton("Journey to the Center of the Earth");
        frame.add(centerButton, BorderLayout.CENTER);
        ActionListener centerListener = e -> {
            info.setText("<html> <h3>Journey to the Center of the Earth</h3> Released: 2008 <br> Staring: Brendan Fraser<html>");
            frame.pack();
            frame.repaint();
        };
        centerButton.addActionListener(centerListener);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
