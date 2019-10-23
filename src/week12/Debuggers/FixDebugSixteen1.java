package week12.Debuggers;// This program should display a bullseye, not a cone

import javax.swing.*;
import java.awt.*;

public class FixDebugSixteen1 extends JPanel {
    String msg = "This is a bull's eye";
    int radius, corner;

    public FixDebugSixteen1() {
        setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new FixDebugSixteen1());
        frame.setSize(340, 340);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        for (corner = 150, radius = 2; radius < 200; radius += 6) {
            if (radius < 50)
                gr.setColor(Color.RED);
            else if (radius < 100)
                gr.setColor(Color.GREEN);
            else if (radius < 150)
                gr.setColor(Color.YELLOW);
            else
                gr.setColor(Color.BLUE);

            gr.drawOval(corner - (radius / 2), corner - (radius / 2), radius, radius);
        }
        gr.setFont(new Font("Arial", Font.ITALIC, 20));
        gr.setColor(Color.BLACK);
        gr.drawString(msg, 0, 275);
    }
}