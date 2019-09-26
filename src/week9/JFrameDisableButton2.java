package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 implements ActionListener {

    private JFrame window;
    private JButton button;
    private int clicked;

    JFrameDisableButton2() {
        window = new JFrame("Clicker");
        button = new JButton("Eight Clicks is all it takes.");
        window.setVisible(true);
        window.setLayout(new FlowLayout());
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);
        window.add(button);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new JFrameDisableButton2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = clicked + 1;
        System.out.println(clicked);
        if (clicked == 8) {
            button.setEnabled(false);
            JLabel ouch = new JLabel("That's enough!");
            window.add(ouch);
        }
        window.validate();
        window.repaint();
    }


}
