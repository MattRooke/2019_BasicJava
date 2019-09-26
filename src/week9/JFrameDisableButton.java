package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton implements ActionListener {

    private JFrame window;
    private JButton button;

    JFrameDisableButton() {
        window = new JFrame("Click");
        button = new JButton("One Click is all it takes.");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);
        window.add(button);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
    }


}
